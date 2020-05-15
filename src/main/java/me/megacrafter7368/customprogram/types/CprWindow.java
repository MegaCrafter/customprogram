package me.megacrafter7368.customprogram.types;

import javax.swing.*;

public class CprWindow extends CprType {

    private final JFrame frame;

    public CprWindow() {
        super(CprVarType.WINDOW);
        this.frame = new JFrame();
    }

    /*
     *  SETTERS
     */

    public void setTitle(String title) {
        frame.setTitle(title);
    }

    public void setWidth(int width) {
        frame.setSize(width, frame.getHeight());
    }

    public void setHeight(int height) {
        frame.setSize(frame.getWidth(), height);
    }

    public void setSize(int width, int height) {
        frame.setSize(width, height);
    }

    public void setX(int x) {
        frame.setBounds(x, frame.getY(), frame.getWidth(), frame.getHeight());
    }

    public void setY(int y) {
        frame.setBounds(frame.getX(), y, frame.getWidth(), frame.getHeight());
    }

    public void setBounds(int x, int y, int width, int height) {
        frame.setBounds(x, y, width, height);
    }

    public void center() {
        frame.setLocationRelativeTo(null);
    }

    /*
     *  GETTER METHODS
     */
    public String title() {
        return frame.getTitle();
    }

    public int width() {
        return frame.getWidth();
    }

    public int height() {
        return frame.getHeight();
    }

    public int x() {
        return frame.getX();
    }

    public int y() {
        return frame.getY();
    }

}