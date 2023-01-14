package CaseStudy.DesignPen;

import CaseStudy.DesignPen.content.Refill;
import CaseStudy.DesignPen.strategy.SmoothWriteStrategy;
import CaseStudy.DesignPen.strategy.WriteStrategy;

public class BallPen extends Pen{
    private Refill refill;
    
    BallPen(Refill r, WriteStrategy strategy) {
        this.refill = r;
        this.objWriteStrategy = strategy;
    }
    @Override
    void write() {
        System.out.println("Ball Pen");
        objWriteStrategy.writeBehaviour();
    }
}
