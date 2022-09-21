//We shall implement interfaces
//The interface is the desired management style of KrankoJobs Holdings , a software development company
//This assignment is within the Java_summative package
package Java_summative;
//We shall then define our interface/ which is a blueprint/template how the company should operate
interface management_system{
    //We set the expected variables and methods
    //However we do not implement them, this will happen in the class implementing the interface
    String company="Krankojobs Holdings";
    void policys();
    void leadership_structure();
    void product();
}
//We the create the Krankojobs class which implements the management system interface
//All the methods and variables in management system have to be implemented
public class krankojobs implements management_system{
    public static void main(String[] args){
        System.out.println(company);
        krankojobs krankojobs=new krankojobs();
        krankojobs.leadership_structure();
        krankojobs.policys();
        krankojobs.product();

    }
//Below is the full implementation of methods in the interface
    @Override
    //This method expresses the policy of Krankojobs holdins

    public void policys() {
        System.out.println("Mission:Krankojobs mission is to ensure that our customers obtain value for their money");
        System.out.println("--------------------------------------------------");
    }
    //This method defines the leadership structure of Krankojobs Holdings
    @Override
    public void leadership_structure() {
        System.out.println("CEO:Samuel Wanza\nCTO:Spencer Kamayo\nCFO/COO:Nahashon Kariuki");
        System.out.println("-----------------------------------------------");

    }
    //This method defines the services offered by Krankojobs Holdings
    @Override
    public void product() {
        System.out.println("We shall offer: \n1.consultacy services in software development\n2.web development\n3.Financial" +
                "management System\n4.Farm Management Systems\n5. And required tailored system");

    }
}
