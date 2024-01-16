public class Counter {

    private int id;

    /**
     * @param id иденьтификатор продукта
     */
    public Counter(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    private void setId(){
        this.id = this.id + 1;
    }

    public int assignId(){
        this.setId();
        return this.getId();
    }

}
