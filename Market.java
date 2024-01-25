import java.util.List;

public class Market implements MarketBehavior, QueueBehavior{

    private List<Actor> queue;
    private List<Actor> readyQueue;

    @Override
    public void acceptToMarket(Actor actor) { // зашел в магазин
        System.out.println("В магазин зашел" + actor);
        this.takeInQueue(actor);
    }
    
    @Override
    public void takeInQueue(Actor actor) { //встать в очередь
        queue.add(actor);
        System.out.println(actor.getName() + " встал в очередь");
    }

    @Override
    public void takeOrders() { //принять заказ 
        for(Actor actor : queue){
            if(actor.isMakeOrder() == false){
                System.out.println("Данный пользователь" + actor.getName() +" совершил заказ");
                actor.setMakeOrder(false);
                this.releaseFromQueue(actor);
            }
        }
    }

    @Override
    public void giveOrders() { // отдать заказ
        for(Actor actor : queue){
            if(actor.isTakeOrder() == true){
                System.out.println("Данный посетитель"+ actor.getName()+ "получил заказ");
                actor.setTakeOrder(true);
            }
        }

    }

    @Override
    public void releaseFromQueue(Actor actor) {  //выйти из очереди
        readyQueue.add(actor);
        System.out.println(actor.getName() + " покинул очередь");
    }

    @Override
    public void releaseFromMarket(Actor actor) { // вышел из магазина
        queue.remove(actor);
        System.out.println(actor.getName() + " покинул магазин");
    }

    @Override
    public void update() { 
        takeOrders();
        giveOrders();
    }
    
}
