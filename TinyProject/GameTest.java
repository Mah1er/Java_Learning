package TinyProject;

public class GameTest {
    
    public static void main(String[] args) {

        Role role1 = new Role("李王子",100);
        Role role2 = new Role("李轩",100);
        
        while(true){
            if(role1.getBlood()!=0){
                role1.attack(role2);
            }else{
                System.out.println(role2.getName()+
                "K.O了"+role1.getName());
                break;
            }
            
            if(role2.getBlood()!=0){
                role2.attack(role1);
            }else{
                System.out.println(role1.getName()+
                "K.O了"+role2.getName());
                break;
            }
        }

    }

}
