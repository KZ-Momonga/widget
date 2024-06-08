import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ChangeColor extends ChangeFont {
    /**
     * ボタンを押すと色が変わる（13種類）
     */
    public JButton getChangeButton(JLabel dateLabel){
        JButton ChangeColor = new JButton("色を変更");
        ChangeColor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent anEvent){
                if(dateLabel.getForeground() == Color.BLACK){
                    dateLabel.setForeground(Color.BLUE); //青色にする
                }else if(dateLabel.getForeground() == Color.BLUE){
                    dateLabel.setForeground(Color.CYAN); //シアン色にする
                }else if(dateLabel.getForeground() == Color.CYAN){
                    dateLabel.setForeground(Color.DARK_GRAY); //ダークグレイ色にする
                }else if(dateLabel.getForeground() == Color.DARK_GRAY){
                    dateLabel.setForeground(Color.GRAY); //グレイ色にする
                }else if(dateLabel.getForeground() == Color.GRAY){
                    dateLabel.setForeground(Color.GREEN); //緑色にする
                }else if(dateLabel.getForeground() == Color.GREEN){
                    dateLabel.setForeground(Color.LIGHT_GRAY); //ライトグレイ色にする
                }else if(dateLabel.getForeground() == Color.LIGHT_GRAY){
                    dateLabel.setForeground(Color.MAGENTA); //マゼンタ色にする
                }else if(dateLabel.getForeground() == Color.MAGENTA){
                    dateLabel.setForeground(Color.ORANGE); //オレンジ色にする
                }else if(dateLabel.getForeground() == Color.ORANGE){
                    dateLabel.setForeground(Color.PINK); //ピンク色にする
                }else if(dateLabel.getForeground() == Color.PINK){
                    dateLabel.setForeground(Color.RED); //赤色にする
                }else if(dateLabel.getForeground() == Color.RED){
                    dateLabel.setForeground(Color.WHITE); //白色にする
                }else if(dateLabel.getForeground() == Color.WHITE){
                    dateLabel.setForeground(Color.YELLOW); //黄色にする
                }else if(dateLabel.getForeground() == Color.YELLOW){ 
                    dateLabel.setForeground(Color.BLACK); //黒色にする
                }
            }
        });

        return ChangeColor;
    }
}
