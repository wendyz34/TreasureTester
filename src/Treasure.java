public class Treasure {
    public static final String diamond = "diamond";
    public static final String silver = "silver";
    public static final String glass = "glass";
    public static final String nothing = "nothing";
    private String treasure = "treasure";

    public Treasure(){
        int num = (int)(Math.random()*3)+1;
        if (num == 1){
            treasure = diamond;
        }else if(num == 2){
            treasure = silver;
        }else if (num == 3){
            treasure = glass;
        }else if (num == 4){
            treasure = nothing;
        }
    }
    public static boolean getAllTreasure(String all){
        boolean getdiamond = (all.indexOf(diamond)!=-1);
        boolean getsilver = (all.indexOf(silver)!=-1);
        boolean getglass = (all.indexOf(glass)!=-1);
        return (getdiamond && getsilver && getglass);
    }
    public String getType(){
        return treasure;
    }
}
