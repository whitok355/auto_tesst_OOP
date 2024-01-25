import java.util.List;

public interface MarketBehavior {

    void acceptToMarket(Actor actor);

    void releaseFromMarket(Actor actor);

    void update();
}