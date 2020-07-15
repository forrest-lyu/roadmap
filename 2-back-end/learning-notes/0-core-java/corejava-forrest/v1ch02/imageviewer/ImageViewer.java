package v1ch02.imageviewer;

import java.awt.*;
import java.io.*;
import javax.swing.*;

/**
 * A program for viewing images.
 * @version 1.0 2020-07-14
 * @author Forrest Lyu <forrest.lyu.dev@gmail.com>
 */
public class ImageViewer
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() -> {
            var myImageViewer = new MyImageViewer();
            myImageViewer.setTitle("ImageViewer");
            myImageViewer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myImageViewer.setVisible(true);
        });
    }
}

/**
 * A frame with a label to show an image.
 */
class MyImageViewer extends JFrame
{
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 400;

    public MyImageViewer()
    {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setLocationRelativeTo(null);

        // 1. Use a label to display the images
        var label = new JLabel();
        add(label);

        // 2. Set up the file chooser
        var chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));

        // 3. Set up the menu bar
        var menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        var menu = new JMenu("File");
        menuBar.add(menu);

        var openItem = new JMenuItem("Open");
        menu.add(openItem);
        openItem.addActionListener(event -> {
            // 1. Show file chooser dialog
            int result = chooser.showOpenDialog(null);

            // 2. If file selected, set it as icon of the label
            if (result == JFileChooser.APPROVE_OPTION)
            {
                String name = chooser.getSelectedFile().getPath();
                label.setIcon(new ImageIcon(name));
            }
        });

        var exitItem = new JMenuItem("Exit");
        menu.add(exitItem);
        exitItem.addActionListener(event -> System.exit(0));
    }
}
