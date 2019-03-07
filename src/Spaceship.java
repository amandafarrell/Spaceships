public class Spaceship {

    int cost;
    int weightInTons;
    int maxWeight;
    int chanceOfLaunchExplosion;
    int chanceOfLandingCrash;

    public Spaceship(int cost, int weightInTons, int maxWeight, int chanceOfLaunchExplosion, int chanceOfLandingCrash) {
        this.cost = cost;
        this.weightInTons = weightInTons;
        this.maxWeight = maxWeight;
        this.chanceOfLaunchExplosion = chanceOfLaunchExplosion;
        this.chanceOfLandingCrash = chanceOfLandingCrash;
    }

    public boolean launch(){
        return true;
    }

    public boolean land(){
        return true;
    }

    public boolean canCarry(Item item){
        return true;
    }

    public void carry (Item item) {
        weightInTons += item.getWeight();
    }
}
