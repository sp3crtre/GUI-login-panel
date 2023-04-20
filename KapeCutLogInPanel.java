import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.*;
import javax.swing.border.LineBorder;

class KapeCutLogInPanel extends Frame {
    public static void main(String[] args) {
        logIn();

    }

    public static void printMessage() {
        System.out.println("you click the button");

    }

    public static void logIn() {
        //GUI FRAME
        JFrame frame = new JFrame();

        //Background image
        // Create a new ImageIcon object
        ImageIcon imageIcon = new ImageIcon("Rectangle.png");
        
        // Create a new JLabel object and set its icon to the ImageIcon object
        JLabel bgImageDesign = new JLabel(imageIcon);

        //Sign up label name for each input
        JLabel email = new JLabel("Email: ");
        JLabel password = new JLabel("Password: ");

        //Frame Title
        JLabel title = new JLabel("KapeCut Login");

        //Authentication label
        JLabel title2 = new JLabel("Login with");

        //Sign up input for email and password
        JTextField Email = new JTextField(40);
        JPasswordField Password = new JPasswordField(50);

        //Authentication Sign up button
        JButton Google = new JButton("Google");
        JButton Facebook = new JButton("Facebook");
        JButton Microsoft = new JButton("Microsoft");

        //Sign up Button to submit data from user input
        JButton LogIn = new JButton("Login");
        JButton SignUp = new JButton("Sign up");

        //ImageIcon properties
        bgImageDesign.setBounds(0, 0, 150, 150);
        
        //TItle properties
        title.setBounds(125, 60, 400, 80);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setForeground(new Color(255, 191, 84));

        //Label properties
        email.setBounds(70, 160, 40, 40);
        password.setBounds(70, 225, 80, 40);

        //Input properties
        Email.setBounds(70, 190, 260, 33);
        Email.setBackground(new Color(247, 247, 247));
        Email.setBorder(null);

        // Create an empty border with 10 pixels of padding
        Border paddingBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);

        // Get the existing border of the text field
        Border border = Email.getBorder();
        
        // Create a compound border that includes the padding border and the existing border
        Border compoundBorder = BorderFactory.createCompoundBorder(border, paddingBorder);

        // Set the compound border on the text field
        Email.setBorder(compoundBorder);

        Password.setBounds(70, 255, 260, 33);
        Password.setBackground(new Color(247, 247, 247));
        Password.setBorder(null);

        // Create an empty border with 10 pixels of padding
        Border paddingBorder2 = BorderFactory.createEmptyBorder(10, 10, 10, 10);

        // Get the existing border of the text field
        Border border2 = Password.getBorder();

        // Create a compound border that includes the padding border and the existing border
        Border compoundBorder2 = BorderFactory.createCompoundBorder(border2, paddingBorder2);

        // Set the compound border on the text field
        Password.setBorder(compoundBorder2);

        //Authentication title
        title2.setBounds(182, 290, 100, 40);

        //Authentication properties
        Microsoft.setBounds(50, 330, 100, 30);
        Microsoft.setBackground(Color.WHITE);
        Microsoft.setBorder(new LineBorder(Color.BLACK, 1));

        Facebook.setBounds(160, 330, 100, 30);
        Facebook.setBackground(Color.WHITE);
        Facebook.setBorder(new LineBorder(Color.BLACK, 1));

        Google.setBounds(270, 330, 100, 30);
        Google.setBackground(Color.WHITE);
        Google.setBorder(new LineBorder(Color.BLACK, 1));

        //Button properties
        LogIn.setBounds(160, 375, 100, 30);
        LogIn.setBackground(new Color(241, 130, 141));
        LogIn.setForeground(Color.WHITE);
        LogIn.setBorder(null);

        SignUp.setBounds(160, 0, 100, 30);
        SignUp.setBackground(Color.PINK);
        SignUp.setForeground(Color.WHITE);
        SignUp.setBorder(null);

        LogIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EMAIL = Email.getText();
                String PASS = Password.getText();
                
                if (EMAIL.equals("usertest@gmail.com")) {
                    if (PASS.equals("usertest12345")) {
                        JOptionPane.showMessageDialog(null, "welcome to the administrator");

                    } else {
                        JOptionPane.showMessageDialog(null, "Incorect password please try again");

                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Credentials not exist");

                }

                printMessage();
            }
        });

        //Container Properties
        frame.setTitle("Kape Cut Login panel");
        frame.setBackground(Color.BLACK);
        frame.setFont(new Font("Poppins", Font.PLAIN, 8)); 

        frame.add(bgImageDesign);

        frame.add(title);
        frame.add(title2);

        frame.add(email);
        frame.add(password);

        frame.add(Email);
        frame.add(Password);

        frame.add(Google);
        frame.add(Microsoft);
        frame.add(Facebook);

        frame.add(LogIn);
        frame.add(SignUp);

        frame.setVisible(true);
        frame.setBounds(465, 100, 430, 500);
        frame.getContentPane().setBackground(new Color(253, 253, 253));
        frame.setSize(430, 500);
        frame.setLayout(null);
        frame.setResizable(false);  
        
    }
} 