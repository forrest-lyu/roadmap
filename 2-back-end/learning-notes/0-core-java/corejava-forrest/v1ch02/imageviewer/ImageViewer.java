package v1ch02.imageviewer;

import java.io.*;
import java.awt.*;
import javax.swing.*;

/**
 * A program is for showing images.
 * @version 1.0
 * @author Forrest Lyu <forrest.lyu.dev@gmail.com>
 */
public class ImageViewer
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() -> {
            var imageViewerFrame = new ImageViewerFrame();
            imageViewerFrame.setTitle("ImageViewer");
            imageViewerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            imageViewerFrame.setVisible(true);
        });
    }
}

/**
 * A class that is inherited from JFrame.
 * @version 1.0
 * @author Forrest Lyu <forrest.lyu.dev@gmail.com>
 */
class ImageViewerFrame extends JFrame
{
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 400;

    public ImageViewerFrame()
    {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        // 1. Use a label to display the images.
        var label = new JLabel();
        add(label);

        // 2. Set up the file chooser.
        var fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("."));

        // 3. Set up the menu bar.
        var menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        var menu = new JMenu("File");
        menuBar.add(menu);

        var openItem = new JMenuItem("Open");
        menu.add(openItem);
        openItem.addActionListener(event -> {
            // 1. Show file chooser dialog.
            int result = fileChooser.showOpenDialog(null);

            // 2. If file selected, set it as icon of the label.
            if (result == JFileChooser.APPROVE_OPTION)
            {
                String filePath = fileChooser.getSelectedFile().getPath();
                label.setIcon(new ImageIcon(filePath));
            }
        });

        var exitItem = new JMenuItem("Exit");
        menu.add(exitItem);
        exitItem.addActionListener(event -> System.exit(0));
    }
}
