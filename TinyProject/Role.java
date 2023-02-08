package TinyProject;
import java.util.Random;

public class Role {
    private String name;
    private int blood;
    
    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    // 定义一个方法 用于攻击别人
    //  r1.attack(r2)
    // 方法的调用者去攻击参数

    public void attack(Role role){
        // this 表示方法的调用者
        
        // 计算造成的伤害
        Random random = new Random();
        int hurt = random.nextInt(20)+1;

        //计算剩余的血量
        int remainBlood = role.getBlood()-hurt;
        remainBlood= remainBlood > 0 ? remainBlood: 0;

        role.setBlood(remainBlood);

        System.out.println(this.getName()+
        "举起拳头,打了"+role.getName()+"一下,"+
        "造成了"+hurt+"点伤害,"+role.getName()+
        "还剩下"+role.getBlood()+"点血");
    }
}
