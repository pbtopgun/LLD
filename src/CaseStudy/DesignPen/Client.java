package CaseStudy.DesignPen;

import CaseStudy.DesignPen.content.Refill;
import CaseStudy.DesignPen.strategy.SmoothWriteStrategy;

public class Client {
    public static void main(String[] args) throws Exception {
        Pen ballPen = new BallPen(new Refill(),new SmoothWriteStrategy());
        ballPen.write();
    }
}
