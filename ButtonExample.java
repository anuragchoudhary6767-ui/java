// public class insert_botton {

//     public static void main(String[] args) {
//         System.out.println("This is a try class.");
        
//     }
    
// }



// import javax.swing.*;

// public class ButtonExample {
//     public static void main(String[] args) {
//         // Create a frame
//         JFrame frame = new JFrame("button ban gyi hai");
//         frame.setSize(900, 600);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         // Create button
//         JButton button = new JButton("Click Me!");


// if (button.getText().equals("Click Me!")) {
//     button.addActionListener(e -> {
//         JOptionPane.showMessageDialog(frame, "Button was clicked!");
//         frame.setTitle("Button Clicked");
//         frame.setSize(400, 300);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//     });
// } else {
//     button.addActionListener(e -> {
//         JOptionPane.showMessageDialog(frame, "Button was not clicked!");
//         frame.setTitle("Button not Clicked");
//         frame.setSize(400, 300);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     });
// }



// private static void openNextPage() {
//         JFrame nextFrame = new JFrame("Next Page");
//         nextFrame.setSize(600, 400);
//         nextFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         JLabel label = new JLabel("Welcome to the Next Page!", SwingConstants.CENTER);
//         nextFrame.add(label);

        
//     }


//         nextFrame.setVisible(true);
//         // Add button to frame
//         frame.add(button);

//         // Make frame visible
//         frame.setVisible(true);
//     }
// }








import javax.swing.*;

public class ButtonExample {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Main Page");
        frame.setSize(900, 600);
        frame.setBackground()
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create button
        JButton button = new JButton("Click Me!");

        // Add action listener
        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Button was clicked!");
            frame.setTitle("Button Clicked");
            frame.setSize(400, 300);

            // Open next page
            openNextPage();
        });

        // Add button to frame
        frame.add(button);

        // Make frame visible
        frame.setVisible(true);
    }

    // ✅ Properly defined method outside main
    private static void openNextPage() {
        JFrame nextFrame = new JFrame("anurag");
        nextFrame.setSize(600, 400);
        nextFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("New Page Me Apka swagat hai!", SwingConstants.CENTER);
        nextFrame.add(label);

        nextFrame.setVisible(true);
    }
}
