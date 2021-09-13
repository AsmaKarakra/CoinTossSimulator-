// Name: Asma Karakra
// USC NetID: Karakra
// CS 455 PA1
// Fall 2021
public class coinTossSimulatorTester {

    public static void main(String [] args) {

            String correction;
            CoinTossSimulator CoinTossComponent = new CoinTossSimulator();

            // After constructor test
            System.out.println("After constructor:");
            System.out.print("Number of trials [exp:0]: ");
            System.out.println(CoinTossComponent.getNumTrials());
            System.out.print("Two-head tosses: ");
            System.out.println(CoinTossComponent.getTwoHeads());
            System.out.print("Two-tail tosses: ");
            System.out.println(CoinTossComponent.getTwoTails());
            System.out.print("One-head one-tail tosses: ");
            System.out.println(CoinTossComponent.getHeadTails());
            if(CoinTossComponent.getNumTrials() == (CoinTossComponent.getTwoHeads()+CoinTossComponent.getTwoTails()+CoinTossComponent.getHeadTails())){
                correction = "True";
            }else{
                correction = "False";
            }
            System.out.print("Tosses add up correctly? ");
            System.out.println(correction);
            System.out.println();

            // After 1 run
            CoinTossComponent.run(1);
            System.out.println("After run(1):");
            System.out.print("Number of trials [exp:1]: ");
            System.out.println(CoinTossComponent.getNumTrials());
            System.out.print("Two-head tosses: ");
            System.out.println(CoinTossComponent.getTwoHeads());
            System.out.print("Two-tail tosses: ");
            System.out.println(CoinTossComponent.getTwoTails());
            System.out.print("One-head one-tail tosses: ");
            System.out.println(CoinTossComponent.getHeadTails());
            if(CoinTossComponent.getNumTrials() == (CoinTossComponent.getTwoHeads()+CoinTossComponent.getTwoTails()+CoinTossComponent.getHeadTails())){
                correction = "True";
            }else{
                correction = "False";
            }
            System.out.print("Tosses add up correctly? ");
            System.out.println(correction);
            System.out.println();

            // After 10 run
            CoinTossComponent.run(10);
            System.out.println("After run(10):");
            System.out.print("Number of trials [exp:11]: ");
            System.out.println(CoinTossComponent.getNumTrials());
            System.out.print("Two-head tosses: ");
            System.out.println(CoinTossComponent.getTwoHeads());
            System.out.print("Two-tail tosses: ");
            System.out.println(CoinTossComponent.getTwoTails());
            System.out.print("One-head one-tail tosses: ");
            System.out.println(CoinTossComponent.getHeadTails());
            if(CoinTossComponent.getNumTrials() == (CoinTossComponent.getTwoHeads()+CoinTossComponent.getTwoTails()+CoinTossComponent.getHeadTails())){
                correction = "True";
            }else{
                correction = "False";
            }
            System.out.print("Tosses add up correctly? ");
            System.out.println(correction);
            System.out.println();

            // After 100 run
            CoinTossComponent.run(100);
            System.out.println("After run(100):");
            System.out.print("Number of trials [exp:111]: ");
            System.out.println(CoinTossComponent.getNumTrials());
            System.out.print("Two-head tosses: ");
            System.out.println(CoinTossComponent.getTwoHeads());
            System.out.print("Two-tail tosses: ");
            System.out.println(CoinTossComponent.getTwoTails());
            System.out.print("One-head one-tail tosses: ");
            System.out.println(CoinTossComponent.getHeadTails());
            if(CoinTossComponent.getNumTrials() == (CoinTossComponent.getTwoHeads()+ CoinTossComponent.getTwoTails() + CoinTossComponent.getHeadTails())){
                correction = "True";
            }else{
                correction = "False";
            }
            System.out.print("Tosses add up correctly? ");
            System.out.println(correction);
            System.out.println();

            // After reset:
            CoinTossComponent.reset();
            System.out.println("After reset:");
            System.out.print("Number of trials [exp:111]: ");
            System.out.println(CoinTossComponent.getNumTrials());
            System.out.print("Two-head tosses: ");
            System.out.println(CoinTossComponent.getTwoHeads());
            System.out.print("Two-tail tosses: ");
            System.out.println(CoinTossComponent.getTwoTails());
            System.out.print("One-head one-tail tosses: ");
            System.out.println(CoinTossComponent.getHeadTails());
            if(CoinTossComponent.getNumTrials() == (CoinTossComponent.getTwoHeads()+ CoinTossComponent.getTwoTails() + CoinTossComponent.getHeadTails())){
                correction = "True";
            }else{
                correction = "False";
            }
            System.out.print("Tosses add up correctly? ");
            System.out.println(correction);
            System.out.println();

            // After 1000 run
            CoinTossComponent.run(1000);
            System.out.println("After run(1000):");
            System.out.print("Number of trials [exp:1000]: ");
            System.out.println(CoinTossComponent.getNumTrials());
            System.out.print("Two-head tosses: ");
            System.out.println(CoinTossComponent.getTwoHeads());
            System.out.print("Two-tail tosses: ");
            System.out.println(CoinTossComponent.getTwoTails());
            System.out.print("One-head one-tail tosses: ");
            System.out.println(CoinTossComponent.getHeadTails());
            if(CoinTossComponent.getNumTrials() == (CoinTossComponent.getTwoHeads()+ CoinTossComponent.getTwoTails()+ CoinTossComponent.getHeadTails())){
                correction = "True";
            }else{
                correction = "False";
            }
            System.out.print("Tosses add up correctly? ");
            System.out.println(correction);
            System.out.println();

        }
    }
