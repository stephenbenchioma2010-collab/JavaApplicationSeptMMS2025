import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

// ========== DRAW PANEL ==========
class DrawPanel extends JPanel {
    private static final int MAX_SHAPES = 100;
    private final MyShape[] shapes = new MyShape[MAX_SHAPES];
    private int shapeCount = 0;
    private int shapeType = 0; // 0-Line, 1-Oval, 2-Rect
    private MyShape currentShape = null;
    private Color currentColor = Color.BLACK;
    private boolean filledShape = false;
    private final JLabel statusLabel;

    public DrawPanel(JLabel statusLabel) {
        this.statusLabel = statusLabel;
        setBackground(Color.WHITE);
        MouseHandler mh = new MouseHandler();
        addMouseListener(mh);
        addMouseMotionListener(mh);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < shapeCount; i++) {
            shapes[i].draw(g, shapes[i].getColor(), shapes[i].isFilled());
        }
        if (currentShape != null) {
            currentShape.draw(g, currentColor, filledShape);
        }
    }

    public void setShapeType(int t) { shapeType = t; }
    public void setCurrentColor(Color c) { currentColor = c; }
    public void setFilledShape(boolean f) { filledShape = f; }

    public void clearLastShape() {
        if (shapeCount > 0) shapeCount--;
        repaint();
    }
    public void clearDrawing() {
        shapeCount = 0;
        repaint();
    }

    private class MouseHandler extends MouseAdapter implements MouseMotionListener {
        @Override
        public void mousePressed(MouseEvent e) {
            currentShape = createShape(shapeType);
            currentShape.setP1(e.getX(), e.getY());
            currentShape.setP2(e.getX(), e.getY());
            currentShape.setColor(currentColor);
            currentShape.setFilled(filledShape);
        }
        @Override
        public void mouseReleased(MouseEvent e) {
            if (currentShape != null) {
                currentShape.setP2(e.getX(), e.getY());
                if (shapeCount < MAX_SHAPES) {
                    shapes[shapeCount++] = currentShape;
                }
                currentShape = null;
                repaint();
            }
        }
        @Override
        public void mouseMoved(MouseEvent e) {
            statusLabel.setText(String.format("Mouse: (%d, %d)", e.getX(), e.getY()));
        }
        @Override
        public void mouseDragged(MouseEvent e) {
            if (currentShape != null) {
                currentShape.setP2(e.getX(), e.getY());
                repaint();
            }
            statusLabel.setText(String.format("Mouse: (%d, %d)", e.getX(), e.getY()));
        }

        private MyShape createShape(int type) {
            return switch (type) {
                case 1 -> new MyOval();
                case 2 -> new MyRect();
                default -> new MyLine();
            };
        }
    }
}

// ========== DRAW FRAME ==========
class DrawFrame extends JFrame {
    private static final String[] COLOR_NAMES = {
        "BLACK", "BLUE", "CYAN", "DARK_GRAY", "GRAY", "GREEN",
        "LIGHT_GRAY", "MAGENTA", "ORANGE", "PINK", "RED", "WHITE", "YELLOW"
    };
    private static final Color[] COLORS = {
        Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN,
        Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW
    };
    private static final String[] SHAPE_NAMES = {"Line", "Oval", "Rectangle"};

    public DrawFrame() {
        super("Java Draw");
        setLayout(new BorderLayout(5,5));

        JLabel statusBar = new JLabel(" ");
        DrawPanel drawPanel = new DrawPanel(statusBar);

        // Top controls
        JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JButton undoBtn = new JButton("Undo Last");
        undoBtn.addActionListener(e -> drawPanel.clearLastShape());
        top.add(undoBtn);

        JButton clearBtn = new JButton("Clear All");
        clearBtn.addActionListener(e -> drawPanel.clearDrawing());
        top.add(clearBtn);

        JComboBox<String> colorBox = new JComboBox<>(COLOR_NAMES);
        colorBox.addActionListener(e ->
            drawPanel.setCurrentColor(COLORS[colorBox.getSelectedIndex()]));
        top.add(new JLabel("Color:")); top.add(colorBox);

        JComboBox<String> shapeBox = new JComboBox<>(SHAPE_NAMES);
        shapeBox.addActionListener(e ->
            drawPanel.setShapeType(shapeBox.getSelectedIndex()));
        top.add(new JLabel("Shape:")); top.add(shapeBox);

        JCheckBox fillCheck = new JCheckBox("Filled");
        fillCheck.addActionListener(e ->
            drawPanel.setFilledShape(fillCheck.isSelected()));
        top.add(fillCheck);

        add(top, BorderLayout.NORTH);
        add(drawPanel, BorderLayout.CENTER);
        add(statusBar, BorderLayout.SOUTH);

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

// ========== TEST ==========
public class DrawTest {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(DrawFrame::new);
    }
}

/* ===== REQUIRED MINIMAL SHAPE CLASSES (place in same package) =====
class MyShape {
    private int x1, y1, x2, y2;
    private Color color;
    private boolean filled;
    public void setP1(int x, int y) { x1=x; y1=y; }
    public void setP2(int x, int y) { x2=x; y2=y; }
    public void setColor(Color c) { color=c; }
    public Color getColor() { return color; }
    public void setFilled(boolean f) { filled=f; }
    public boolean isFilled() { return filled; }
    public void draw(Graphics g, Color c, boolean f) {}
}
class MyLine extends MyShape {
    public void draw(Graphics g, Color c, boolean f) {
        g.setColor(c);
        g.drawLine(x1,y1,x2,y2);
    }
}
class MyOval extends MyShape {
    public void draw(Graphics g, Color c, boolean f) {
        g.setColor(c);
        int x=Math.min(x1,x2), y=Math.min(y1,y2);
        int w=Math.abs(x2-x1), h=Math.abs(y2-y1);
        if(f) g.fillOval(x,y,w,h); else g.drawOval(x,y,w,h);
    }
}
class MyRect extends MyShape {
    public void draw(Graphics g, Color c, boolean f) {
        g.setColor(c);
        int x=Math.min(x1,x2), y=Math.min(y1,y2);
        int w=Math.abs(x2-x1), h=Math.abs(y2-y1);
        if(f) g.fillRect(x,y,w,h); else g.drawRect(x,y,w,h);
    }
}
*/