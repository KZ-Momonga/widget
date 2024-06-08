import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class WidgetClock extends ChangeColor {
    /**
     * ChangeColorを継承したWidgetClockを実行する
     */
    public void perform(){

        

        //ウィンドウの生成
        JFrame mainFrame = new JFrame("WidgetClock");//ウィンドウobjectの生成
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//xで閉じる
        mainFrame.setSize(600, 600);//ウィンドウのサイズ
        mainFrame.setLayout(new GridLayout(4, 1));//2行1列のレイアウト

        //時計ラベルの設定
        JLabel dateLabel = new JLabel();
        dateLabel.setFont(new Font("Consolas", Font.ITALIC, 48));
        dateLabel.setForeground(Color.BLACK);

        Canvas aCanvas = new Canvas(){
            public void paint(Graphics aGraphics){  //aGraphics : 筆
                WidgetClock.this.drawImage(aGraphics);
            }
        };


        //ラベルの表示
        mainFrame.add(dateLabel);

        //mainFrameに追加
        mainFrame.add(this.getChangeButton(dateLabel));
        mainFrame.add(this.ChangeLabel(dateLabel));
        mainFrame.add(aCanvas);
        

        //ウィンドウの表示
        mainFrame.setVisible(true);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        

        //タイマータスク（時刻ラベル更新処理）
        TimerTask aTask = new TimerTask() {
            public void run(){
                Date aDate = new Date();
                dateLabel.setText(sdf.format(aDate));
            }
        };

        //タイマーの定義（1秒ごとに実行）
        Timer aTimer = new Timer();
        aTimer.scheduleAtFixedRate(aTask, 0, 1000);

        TimerTask aCanvasTask = new TimerTask(){
            public void run(){
                aCanvas.repaint(); //再描画する:paint()
            }
        };

        Timer aCanvasTimer = new Timer();
        aCanvasTimer.scheduleAtFixedRate(aCanvasTask, 0, 1000);

    }

    public void drawImage(Graphics aGraphics){
        //画像オブジェクトを取得する
        BufferedImage pen1Image = this.getHandImage1();
        BufferedImage pen2Image = this.getHandImage2();
        BufferedImage pen3Image = this.getHandImage3();
        BufferedImage pen4Image = this.getHandImage4();
        BufferedImage pen5Image = this.getHandImage5();
        BufferedImage pen6Image = this.getHandImage6();

        //現在秒を取得
        int currentSeconds = Calendar.getInstance().get(Calendar.SECOND);

        //10秒区切りで画像を描画する
        if(currentSeconds <= 10){
            aGraphics.drawImage(pen1Image, 0, 0, null);
        } else if(currentSeconds <= 20){
            aGraphics.drawImage(pen2Image, 0, 0, null);
        } else if(currentSeconds <= 30){
            aGraphics.drawImage(pen3Image, 0, 0, null);
        } else if(currentSeconds <= 40){
            aGraphics.drawImage(pen4Image, 0, 0, null);
        } else if(currentSeconds <= 50){
            aGraphics.drawImage(pen5Image, 0, 0, null);
        } else if(currentSeconds <= 60){
            aGraphics.drawImage(pen6Image, 0, 0, null);
        }
    }

    public BufferedImage getHandImage1(){
        File pen1 = new File("pen1.png");
        // 1.画像をファイルから読み込む
        BufferedImage pen1Image = null;  //変数の初期化
        try { //今から危ないことをやるぞ...
            pen1Image = ImageIO.read(pen1);//画像を読み込む（危険）
        }catch(IOException anException){ //まずいことが起きたら...
            anException.printStackTrace();  //その詳細を表示する
        }
        return pen1Image;
    }
    
    public BufferedImage getHandImage2(){
        File pen2 = new File("pen2.png");
        // 1.画像をファイルから読み込む
        BufferedImage pen2Image = null;  //変数の初期化
        try { //今から危ないことをやるぞ...
            pen2Image = ImageIO.read(pen2);//画像を読み込む（危険）
        }catch(IOException anException){ //まずいことが起きたら...
            anException.printStackTrace();  //その詳細を表示する
        }
        return pen2Image;
    }

    public BufferedImage getHandImage3(){
        File pen3 = new File("pen3.png");
        // 1.画像をファイルから読み込む
        BufferedImage pen3Image = null;  //変数の初期化
        try { //今から危ないことをやるぞ...
            pen3Image = ImageIO.read(pen3);//画像を読み込む（危険）
        }catch(IOException anException){ //まずいことが起きたら...
            anException.printStackTrace();  //その詳細を表示する
        }
        return pen3Image;
    }

    public BufferedImage getHandImage4(){
        File pen4 = new File("pen4.png");
        // 1.画像をファイルから読み込む
        BufferedImage pen4Image = null;  //変数の初期化
        try { //今から危ないことをやるぞ...
            pen4Image = ImageIO.read(pen4);//画像を読み込む（危険）
        }catch(IOException anException){ //まずいことが起きたら...
            anException.printStackTrace();  //その詳細を表示する
        }
        return pen4Image;
    }

    public BufferedImage getHandImage5(){
        File pen5 = new File("pen5.png");
        // 1.画像をファイルから読み込む
        BufferedImage pen5Image = null;  //変数の初期化
        try { //今から危ないことをやるぞ...
            pen5Image = ImageIO.read(pen5);//画像を読み込む（危険）
        }catch(IOException anException){ //まずいことが起きたら...
            anException.printStackTrace();  //その詳細を表示する
        }
        return pen5Image;
    }

    public BufferedImage getHandImage6(){
        File pen6 = new File("pen6.png");
        // 1.画像をファイルから読み込む
        BufferedImage pen6Image = null;  //変数の初期化
        try { //今から危ないことをやるぞ...
            pen6Image = ImageIO.read(pen6);//画像を読み込む（危険）
        }catch(IOException anException){ //まずいことが起きたら...
            anException.printStackTrace();  //その詳細を表示する
        }
        return pen6Image;
    }
}
