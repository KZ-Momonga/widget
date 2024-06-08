import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ChangeFont {
    /**
     * ボタンを押すとフォントを変更する
     */
    public JButton ChangeLabel(JLabel dateLabel){
        JButton ChangeLabel = new JButton("フォントを変える");
        ChangeLabel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent anEvent){
                
                dateLabel.setFont(new Font("太字", Font.BOLD, 48));
                    
            }
        });

        return ChangeLabel;
    }

}
