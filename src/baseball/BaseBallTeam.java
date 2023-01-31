package baseball;

public class BaseBallTeam {
    //フィールド
    private String name;
    private int win;
    private int lose;
    private int draw;

    //引数のないコンストラクタ
    public BaseBallTeam() {
    }

    //引数のあるコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    //gerRate()メソッド
    public double getRate() {
        double rate = (double)this.win /(this.win + this.lose);
        return rate;
    }

    //report()メソッド
    public void report() {
        System.out.println(this.name + "の2022年の成績は " + this.win + "勝 " + this.lose + "敗　" + this.draw + "分、勝率は " + getRate() + "です。");
    }

 }

