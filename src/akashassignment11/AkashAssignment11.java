/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akashassignment11;

import java.util.Scanner;
/**
 *
 * @author akash
 */
public class AkashAssignment11 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyedInput = new Scanner (System.in);    
        
        // String variables declared to store the User Name and User Decision
        String UserName;
        String UserDecision1;
        String UserDecision2;
        
        // Story Synopsis / Opening Scene along with the Rules for User to understand how to pick options
        System.out.println("                      LOST IN RAINFOREST - SURVIVAL CHALLENGES                         ");
        System.out.println("                      ****************************************                         ");
        System.out.println("");
        System.out.println("SYNOPSIS  :  You are a new adventurer who has been exploring the Congo Rainforest for  a");
        System.out.println("             few days. While exploring the rainforest, you get split up from your travel");
        System.out.println("             group and are now lost. Your resources are running out,  and the rainforest");
        System.out.println("             is full of trouble. You must make your way out of the rainforest or succumb");
        System.out.println("             to fate. ");
        System.out.println("");
        System.out.println("RULE     :  1) As this story would be interactive, for every question, you need to input");
        System.out.println("               the actual Option value or the Option Number.");
        System.out.println("            2) If you input any other values, you will be asked the question again.");
        System.out.println("");
        System.out.println("");
        
        // Gets the User Name as an input to address by name
        System.out.print("Please input your name   :   ");
        UserName = keyedInput.nextLine();
        System.out.println("");
        
        //1st Main Option for user to make, between Mountain or River. For any invalid inputs, the question would be asked again
        //do while loop added to the logic, to ensure that user provides the correct Option to proceed with the story
        DisplayContext("        < Select your adventure choice, the Harsh Mountains or the Terrifying Rivers. >","        < Be aware, there may be some frightening experiences in both.                >");
        do
        {
            System.out.println("Hi "+UserName+", Do you prefer to take MOUNTAIN or RIVER route ?");
            System.out.print("1) MOUNTAIN     2) RIVER                                     :     ");
            UserDecision1 = keyedInput.nextLine().toUpperCase();
        } while (!UserDecision1.matches ("MOUNTAIN|RIVER|1|2"));
      
        //Decision 1 - Mountain Path
        if (UserDecision1.matches ("MOUNTAIN|1"))
        {
            DisplayContext("        < You seem to like harsh terrains and picked mountaneous route. Now let us see>","        < whether you love to reach heights or travel on the ground                   >");
            do
            {
                System.out.println("Do you want to Climb or Walk Around ?");
                System.out.print("1) CLIMB     2) WALK AROUND                                  :     ");
                UserDecision2 = keyedInput.nextLine().toUpperCase();
            } while (!UserDecision2.matches ("CLIMB|WALK AROUND|1|2"));

            //Decision 2 - Climbing the Mountain
            if (UserDecision2.matches ("CLIMB|1"))
            {
                MountainClimb();
            }
            //else for Decision 2 - Walk Around the Mountain
            else
            {
                MountainWalkAround();
            }  
        }
        //else for Decision 1 - River Path
        else
        {
            River();
        }
    } 

    public static void MountainClimb() {
        
        //User defined function to be called if the User Picks to Climb the Mountain to travel across Rainforest
        
        Scanner keyedInput = new Scanner (System.in);  
        
        // String variables declared to store the User Decisions
        String UserDecision3;
        String UserDecision4;
        String UserDecision5;
        String UserDecision6;
        String UserDecision7;
        String UserDecision8;
        String UserDecision9;
        String UserDecision10;
        String UserDecision11;
        String UserDecision12;
        
        DisplayContext("        < While climbing up the mountain, you notice a popup shop in the near distance>","        < but you have very limited money for any purchases.                          >");
        do
        {
            System.out.println("Do you want to Purchase a tool ?");
            System.out.print("1) YES     2) NO                                             :     ");
            UserDecision3 = keyedInput.nextLine().toUpperCase();
        } while (!UserDecision3.matches ("YES|NO|1|2"));
        
        //Decision 3 - Agrees to Purchase a tool from the Shop
        if (UserDecision3.matches ("YES|1"))
        {
            DisplayContext("        < The shop seems to have some excellent choices in store today with special   >","        < discount on 100 M long rope and mountain boots.                             >");
            do
            {
                System.out.println("Do you want to Buy a rope or a boot ?");
                System.out.print("1) ROPE     2) BOOT                                          :     ");
                UserDecision4 = keyedInput.nextLine().toUpperCase();
            } while (!UserDecision4.matches ("ROPE|BOOT|1|2"));
            
            //Decision 4 - Buys ROPE from Shop
            if (UserDecision4.matches ("ROPE|1"))
            {
            DisplayContext("        < The shop owner really cares about your safety &  asks if you would like some>","        < assistance on your journey out of the rainforest.                           >");
                do
                {
                    System.out.println("Do you need assistance ?");
                    System.out.print("1) YES     2) NO                                             :     ");
                    UserDecision5 = keyedInput.nextLine().toUpperCase();
                } while (!UserDecision5.matches ("YES|NO|1|2")); 
                
                //Decision 5 - Agrees to having Assistance for climbing        
                if (UserDecision5.matches ("YES|1"))
                {
                    //DisplayContext("        < The shop owner really cares about your safety &  asks if you would like some>","        < assistance on your journey out of the rainforest.  
                    System.out.println("");
                    System.out.println("CONGRATS, with the shop owner's assistance, you managed to climb the mountain with");
                    System.out.println("your handy rope and got yourself out of the rainforest successfully. YOU SURVIVED.");
                    System.out.println("");
                    System.out.println("                                **** THE END ****                                 ");
                    System.out.println("");
                    
                }  
                //else for Decision 5 - Declines Assistance
                else
                {
                    System.out.println("");
                    System.out.println("Being a new adventurer, you struggled to travel on your own across the mountains,");
                    System.out.println("and got lost in the middle. Wandered for long and faced DEATH. RIP");
                    System.out.println("");
                    System.out.println("                                **** THE END ****                                ");
                    System.out.println("");
                } 
            }
            //else for Decision 4 - Buys BOOT from Shop
            else
            {
                DisplayContext("        < The boots were not as trustworthy as you might have thought.You slipped on a>","        < rock, while climbing up the mountain and are now badly injured.             >");
                do
                {
                    System.out.println("Do you wait for help or continue the Journey by yourself ?");
                    System.out.print("1) WAIT     2) CONTINUE                                      :     ");
                    UserDecision6 = keyedInput.nextLine().toUpperCase();
                } while (!UserDecision6.matches ("WAIT|CONTINUE|1|2")); 
                
                //Decision 6 - Decides to wait for HELP to arrive  
                if (UserDecision6.matches ("WAIT|1"))
                {
                    System.out.println("");
                    System.out.println("Congratulations, help arrived. A group of hikers saw you and managed to take you");
                    System.out.println("to safety outside of the rainforest. YOU SURVIVED.");
                    System.out.println("");
                    System.out.println("                                **** THE END ****                                 ");
                    System.out.println("");
                } 
                //else for Decision 6 - Decides to Continue with the Journey, inspite of the injury
                else
                {
                // If you want to continue without waiting for help
                    DisplayContext("        < While continuing on your journey, there was a massive thunderstorm in the   >","        < rainforest. It is time to make a crucial call.                              >");
                    do
                    {
                        System.out.println("Do you want to take Shelter or keep moving ?");
                        System.out.print("1) SHELTER     2) KEEP MOVING                                :     ");
                        UserDecision7 = keyedInput.nextLine().toUpperCase();
                    } while (!UserDecision7.matches ("SHELTER|KEEP MOVING|1|2"));  
                    
                    //Decision 7 - Opts for Shelter to take rest
                    if (UserDecision7.matches ("SHELTER|1"))
                    {
                        DisplayContext("        < During shelter, you noticed that you are running short of water.  After a   >","        < while, you got extremely dehydrated and desperate to find a water source.   >");
                        do
                        {
                            System.out.println("Do you want to drink water from Pond or stay dehydrated ?");
                            System.out.print("1) DRINK FROM POND   2) STAY DEHYDRATED                           :     ");
                            UserDecision8 = keyedInput.nextLine().toUpperCase();
                        } while (!UserDecision8.matches ("DRINK FROM POND|STAY DEHYDRATED|1|2"));
                        
                        //Decision 8 - Agrees to drink water from nearby Pond        
                        if (UserDecision8.matches ("DRINK FROM POND|1"))
                        {
                            System.out.println("");
                            System.out.println("Lucky you.  The water from the pond had a secret medicinal  mix and it completely");
                            System.out.println("hydrated as well as healed all your prior injuries. You also noticed that it gave");
                            System.out.println("you secret powers,  which allowed you to get a speed climbing ability.  With this");
                            System.out.println("ability you managed to reach the top of the mountain, scout the area out and make");
                            System.out.println("it out of the rainforest in no time. YOU SURVIVED.");
                            System.out.println("");
                            System.out.println("                                **** THE END ****                                ");
                            System.out.println("");
                        }  
                        //else for Decision 8 - Doubted the water in the pond and decides to stay dehydrated
                        else
                        {
                            System.out.println("");
                            System.out.println("Unfortunately, you died due to the lack of water in your body system. RIP");
                            System.out.println("");
                            System.out.println("                                **** THE END ****                                 ");
                            System.out.println("");
                        }
                    } 
                    //else for Decision 7 - Decided to keep moving inspite of the Thunderstorm
                    else
                    {
                        System.out.println("");
                        System.out.println("Sorry, you died a gruesome death. While continuing to move through the fearsome");
                        System.out.println("thunderstorm, you ended up getting electrocuted and then burnt to a crisp. RIP ");
                        System.out.println("");
                        System.out.println("                                **** THE END ****                                 ");
                        System.out.println("");
                    }
                }
            } 
        }
        //else for Decision 3 - Declines to Purchase tool from Shop
        else
        {
            DisplayContext("        < CAUTION CAUTION....  There is a small collapse of boulders at the top of the>","        < mountain, falling down extremely fast.                                      >");
            
            do
            {
                System.out.println("Do you want to continue journey or wait for Boulder to stop ?");
                System.out.print("1) CONTINUE     2) WAIT                                      :     ");
                UserDecision9 = keyedInput.nextLine().toUpperCase();
            } while (!UserDecision9.matches ("CONTINUE|WAIT|1|2"));
            
            //Decision 9 - Wants to continue journey in the midst of the boulder collapse
            if (UserDecision9.matches ("CONTINUE|1"))
            {
                DisplayContext("        < While continuing your climb up the mountain with the large boulders falling,>","        < one of them pinned your right arm and you are stuck                         >");
                do
                {
                    System.out.println("Do you want to stay calm or yell for help ?");
                    System.out.print("1) STAY CALM     2) YELL FOR HELP                            :     ");
                    UserDecision10 = keyedInput.nextLine().toUpperCase();
                } while (!UserDecision10.matches ("STAY CALM|YELL FOR HELP|1|2"));

                //Decision 10 - Got stuck and wanted to stay calm
                if (UserDecision10.matches ("STAY CALM|1"))
                {
                DisplayContext("        < You stayed calm in this PAINFUL situation. Your resources are running out   >","        < and your blood circulation in your arm is going to completely cut off.      >");
                    do
                    {
                        System.out.println("Do you want to amputate your arm or do nothing ?");
                        System.out.print("1) AMPUTATE     2) DO NOTHING                                :     ");
                        UserDecision11 = keyedInput.nextLine().toUpperCase();
                    } while (!UserDecision11.matches ("AMPUTATE|DO NOTHING|1|2"));

                    //Decision 11 - Amputate arm to free himself/herself from under the rocks    
                    if (UserDecision11.matches ("AMPUTATE|1"))
                    {
                        System.out.println("");
                        System.out.println("You have cut  your right arm off from the  shoulder and surprisingly felt no pain");
                        System.out.println("due to the low blood circulation.  You managed to climb up the mountain with just");
                        System.out.println("one hand. As you reached the top of the mountain, there were groups of hikers who");
                        System.out.println("all came to your aid and carried you out of the rainforest.  YOU SURVIVED.       ");
                        System.out.println("");
                        System.out.println("                                **** THE END ****                                ");
                        System.out.println("");
                    }
                    //else for Decision 11 - Decided to DO NOTHING and left the fate to GOD
                    else
                    {
                        System.out.println("");
                        System.out.println("Unfortunately, you got stuck for long and died of starvation and pain. RIP");
                        System.out.println("");
                        System.out.println("                                **** THE END ****                                ");
                        System.out.println("");
                    }    
                }
                //else for Decision 10 - Started Yelling for Help in pain
                else
                {
                    System.out.println("");
                    System.out.println("Yelling for help did not go as planned, as no one came to your rescue for a very ");
                    System.out.println("long period.  You died of cardiac arrest. RIP");
                    System.out.println("");
                    System.out.println("                                **** THE END ****                                ");
                    System.out.println("");     
                }
            }
            //else for Decision 9 - Decided to wait for boulder falling to stop
            else
            {
                DisplayContext("        < You have decided to wait for boulders to stop. Unfortunately you waited too >","        < long and seems the boulders falling has not stopped yet.                    >");
                do
                {
                    System.out.println("Do you want to return back or keep moving ?");
                    System.out.print("1) RETURN BACK     2) KEEP MOVING                            :     ");
                    UserDecision12 = keyedInput.nextLine().toUpperCase();
                } while (!UserDecision12.matches ("RETURN BACK|KEEP MOVING|1|2")); 

                //Decision 12 - Made a decision to RETURN BACK, to save life
                if (UserDecision12.matches ("RETURN BACK|1"))
                {
                    System.out.println("");
                    System.out.println("PERFECT. You made the  right choice to return to the bottom of the mountain.  You");
                    System.out.println("got help from the  shop owner and he gave you  directions to exit the rainforest.");
                    System.out.println("YOU SURVIVED.       ");
                    System.out.println("");
                    System.out.println("                                **** THE END ****                                ");
                    System.out.println("");
                } 
                //else for Decision 12 - Became impatient and decides to keep moving even when the boulder keeps falling
                else
                {
                    System.out.println("");
                    System.out.println("Keep Moving was not the right choice as you got squished like a bug by the large ");
                    System.out.println("boulders falling from the top of the mountain. You DIED. RIP");
                    System.out.println("");
                    System.out.println("                                **** THE END ****                                ");
                    System.out.println("");
                }      
            }
        }
    }
    
    public static void MountainWalkAround() {
        
        //User defined function to be called if the User Picks to walk around the Mountain to travel across Rainforest
        
        Scanner keyedInput = new Scanner (System.in); 
        
        // String variables declared to store the User Decisions
        String UserDecision13;
        String UserDecision14;
        String UserDecision15;
        String UserDecision16;
        String UserDecision17;
        String UserDecision18;
        String UserDecision19;
        String UserDecision20;
        String UserDecision21;
        String UserDecision22;
        String UserDecision23;
        String UserDecision24;
        String UserDecision25;
        String UserDecision26;
        String UserDecision27;
        
        DisplayContext("        < You would see 2 paths ahead of you, a Long but Safe Path and a Short but    >","        < Dangerous path. Each would give you a different experience.                 >");
        do
        {
            System.out.println("Do you prefer LONG safe Path or Short Dangerous Path ?");
            System.out.print("1) LONG     2) SHORT                                         :     ");
            UserDecision13 = keyedInput.nextLine().toUpperCase();
        } while (!UserDecision13.matches ("LONG|SHORT|1|2"));
        
        //Decision 13 - Chooses LONG path to cross the Mountain
        if (UserDecision13.matches ("LONG|1"))
        {
            DisplayContext("        < While walking around the mountain, you got really tired and it's getting    >","        < really dark outside.                                                        >");
            do
            {
                System.out.println("Do you want to stay overnight or continue without Break ?");
                System.out.print("1) STAY OVERNIGHT     2) CONTINUE JOURNEY                    :     ");
                UserDecision14 = keyedInput.nextLine().toUpperCase();
            } while (!UserDecision14.matches ("STAY OVERNIGHT|CONTINUE JOURNEY|1|2"));
            
            //Decision 14 - Needed rest and decides to Stay Overnight
            if (UserDecision14.matches ("STAY OVERNIGHT|1"))
            {
                DisplayContext("        < You are extremely tired of the long journey. You have brought a tent with   >","        < you, which would need some time to set-up.                                  >");
                do
                {
                    System.out.println("Do you want to Camp or Sleep in the open Sky ?");
                    System.out.print("1) CAMP     2) OPEN SKY                                      :     ");
                    UserDecision15 = keyedInput.nextLine().toUpperCase();
                } while (!UserDecision15.matches ("CAMP|OPEN SKY|1|2"));
                
                //Decision 15 - Decides to set the CAMP for night stay  
                if (UserDecision15.matches ("CAMP|1"))
                {
                    DisplayContext("        < You are getting extremely hungry from all that walking throughout the day,  >","        < but you are also extremely sleepy.                                          >");
                    do
                    {
                        System.out.println("Do you want to sleep or cook food ?");
                        System.out.print("1) SLEEP     2) COOK                                         :     ");
                        UserDecision16= keyedInput.nextLine().toUpperCase();
                    } while (!UserDecision16.matches ("SLEEP|COOK|1|2"));
                    
                    //Decision 16 - Due to tiredness, decides to Sleep  
                    if (UserDecision16.matches ("SLEEP|1"))
                    {
                        DisplayContext("        < While sleeping, you heard a lot of strange noises outside your tent.        >","        <                                                                             >");
                        do
                        {
                            System.out.println("Do you want to get-up & investigate or continue sleeping ?");
                            System.out.print("1) INVESTIGATE     2) CONTINUE SLEEPING                      :     ");
                            UserDecision17= keyedInput.nextLine().toUpperCase();
                        } while (!UserDecision17.matches ("INVESTIGATE|CONTINUE SLEEPING|1|2"));
                        
                        //Decision 17 - With curiosity, wanted to Investigate the strange noise outside the Camp    
                        if (UserDecision17.matches ("INVESTIGATE|1"))
                        {
                            DisplayContext("        < While you got out of tent, to your surprise, you saw a HUGE aggressive black>","        < grizzly bear.                                                               >");
                            do
                            {
                                System.out.println("Do you want to run away from Bear or fight it ?");
                                System.out.print("1) RUN AWAY     2) FIGHT                                     :     ");
                                UserDecision18= keyedInput.nextLine().toUpperCase();
                            } while (!UserDecision18.matches ("RUN AWAY|FIGHT|1|2"));  
                            
                            //Decision 18 - With fear, decides to RUN AWAY from Bear        
                            if (UserDecision18.matches ("RUN AWAY|1"))
                            {
                                DisplayContext("        < You managed to successfully run away from that giant beast, but it is pitch >","        < black outside.                                                              >");
                                do
                                {
                                    System.out.println("Do you have a Flash Light or not?");
                                    System.out.print("1) YES     2) NO                                             :     ");
                                    UserDecision19= keyedInput.nextLine().toUpperCase();
                                } while (!UserDecision19.matches ("YES|NO|1|2"));  
                                
                                //Decision 19 - Has a Flashlight to help in the dark        
                                if (UserDecision19.matches ("YES|1"))
                                {
                                    System.out.println("");
                                    System.out.println("With the use of the Flash Light, you managed to see through the dark and with your   1");
                                    System.out.println("adrenaline kicking in, you ran all the way to the end of the rainforest. YOU SURVIVED");
                                    System.out.println("");
                                    System.out.println("                                **** THE END ****                                ");
                                    System.out.println("");
                                }
                                //else for Decision 19 - Dont have a Flashlight to guide him/her in the dark
                                else
                                {
                                    System.out.println("");
                                    System.out.println("Running madly, without able to see things clearly, you tripped on a rock and fell ");
                                    System.out.println("from the cliff. You DIED. RIP");
                                    System.out.println("");
                                    System.out.println("                                **** THE END ****                                ");
                                    System.out.println("");
                                }
                            }
                            //else for Decision 18 - With boldness, decides to fight the Bear
                            else
                            {
                                System.out.println("");
                                System.out.println("BOLD Move. You fought like a champion but couldnt survive the fight with the Beast.");
                                System.out.println("You DIED. RIP");
                                System.out.println("");
                                System.out.println("                                **** THE END ****                                ");
                                System.out.println("");
                            }  
                        }
                        //else for Decision 17 - Disregards the strange noise outside the Camp and Continue sleeping
                        else
                        {
                            System.out.println("");
                            System.out.println("Your laziness cost your life and fell as a pray to Grizzly Bear. You DIED. RIP");
                            System.out.println("");
                            System.out.println("                                **** THE END ****                                ");
                            System.out.println("");    
                        }    
                    }
                    //else for Decision 16 - Decides to Cook before going to bed
                    else
                    {
                        DisplayContext("        < As you are extremely hungry, you need to make a choice on spending time to  >","        < prepare fresh meal by lighting fire or rely on canned food.                 >");
                        do
                        {
                            System.out.println("Do you want to light up fire or eat canned food ?");
                            System.out.print("1) LIGHT FIRE     2) CANNED FOOD                           :     ");
                            UserDecision20= keyedInput.nextLine().toUpperCase();
                        } while (!UserDecision20.matches ("LIGHT FIRE|CANNED FOOD|1|2"));
                        
                        //Decision 20 - Lights fire to cook fresh food
                        if (UserDecision20.matches ("LIGHT FIRE|1"))
                        {
                            DisplayContext("        < While lighting the fire on your stove, the tent caught fire. It has turned  >","        < into a huge fireball.                                                       >");
                            do
                            {
                                System.out.println("Do you want to run away or try to put off the fire ?");
                                System.out.print("1) RUN AWAY     2) PUTOFF FIRE                                :     ");
                                UserDecision21= keyedInput.nextLine().toUpperCase();
                            } while (!UserDecision21.matches ("RUN AWAY|PUTOFF FIRE|1|2"));
                            
                            //Decision 21 - Runs away to escape fire   
                            if (UserDecision21.matches ("RUN AWAY|1"))
                            {
                                System.out.println("");
                                System.out.println("Running away saved you from the fire but also made you so scared that you ran all");
                                System.out.println("the way out of the rainforest. You ran so fast that not even the darkness or an  ");
                                System.out.println("animal can block you from leaving. YOU SURVIVED.");
                                System.out.println("");
                                System.out.println("                                **** THE END ****                                ");
                                System.out.println("");
                            }
                            //else for Decision 21 - Decides to put off fire in the camp
                            else
                            {
                                System.out.println("");
                                System.out.println("Trying to put off the fire may not have been the brightest thing to do when you  ");
                                System.out.println("are alone, as you suffered major burn injuries and died of the gruesome pain. RIP");
                                System.out.println("");
                                System.out.println("                                **** THE END ****                                ");
                                System.out.println("");
                            }                              
                        }
                        //else for Decision 20 - Decides to eat Canned Food
                        else
                        {
                            DisplayContext("        < The canned corn agitated your stomach and caused a very painful stomach flu.>","        <                                                                             >");
                            do
                            {
                                System.out.println("Do you want to get help or continue the journey with stomach flu ?");
                                System.out.print("1) GET HELP     2) CONTINUE JOURNEY                          :     ");
                                UserDecision22= keyedInput.nextLine().toUpperCase();
                            } while (!UserDecision22.matches ("GET HELP|CONTINUE JOURNEY|1|2"));
                            
                            //Decision 22 - Decides to get help to address the Stomach Flu   
                            if (UserDecision22.matches ("GET HELP|1"))
                            {
                                System.out.println("");
                                System.out.println("During your wait, you found a group of hikers and explained your situation to them.");
                                System.out.println("They gave you some quick and helpful antibiotics like tylenol and some painkillers ");
                                System.out.println("and they managed to get you out of the rainforest. YOU SURVIVED.");
                                System.out.println("");
                                System.out.println("                                **** THE END ****                                  ");
                                System.out.println("");
                            }
                            //else for Decision 22 - Decides to continue journey with severe Stomach Flu
                            else
                            {
                                System.out.println("");
                                System.out.println("With unbearable stomach pain, you decided to continue the journey in darkness.   ");
                                System.out.println("You DIED. RIP                                                                    ");
                                System.out.println("");
                                System.out.println("                                **** THE END ****                                ");
                                System.out.println("");
                            }                              
                        }                       
                    }   
                }
                //else for Decision 15 - Decides to sleep in the OPEN SKY
                else
                {
                    System.out.println("");
                    System.out.println("Open Sky was not a very intuitive decision as the rainforest is filled with dangerous");
                    System.out.println("creatures. A snake snuck up on you during your sleep and bit you, causing you to die ");
                    System.out.println("of venom poisoning with no help around you. You DIED. RIP");
                    System.out.println("");
                    System.out.println("                                **** THE END ****                                    ");
                    System.out.println("");
                }
            }
            //else for Decision 14 - To get out of the mountain, decides to Continue journey
            else
            {
                System.out.println("");
                System.out.println("Even though you felt very tired, your determination to get out of the rainforest   ");
                System.out.println("helped you reach the destination. YOU SURVIVED.                                    ");
                System.out.println("");
                System.out.println("                                **** THE END ****                                  ");
                System.out.println("");
            } 
        }
        //else for Decision 13 - Chooses SHORT path to cross the Mountain
        else
        {
            DisplayContext("        < While walking in the short path, you encountered a large log that blocked ur>","        < main path, Now you have 2 paths labeled A and B. Good luck with ur choice   >");
            do
            {
                System.out.println("Do you want to take Path A or Path B ?");
                System.out.print("1) PATH-A     2) PATH-B                                      :     ");
                UserDecision23 = keyedInput.nextLine().toUpperCase();
            } while (!UserDecision23.matches ("PATH-A|PATH-B|1|2"));
            
            //Decision 23 - Picks Path-A to try his luck
            if (UserDecision23.matches ("PATH-A|1"))
            {
                System.out.println("");
                System.out.println("Lucky you, path A led you to a herd of elephants who were gentle and willing to let");
                System.out.println("you ride them and carried you out of the rainforest to safety. YOU SURVIVED        ");
                System.out.println("");
                System.out.println("                                **** THE END ****                                  ");
                System.out.println("");
            }
            //else for Decision 23 - Picks Path-B
            else
            {   
                DisplayContext("        < Path B led  you to a fierce coyote. The coyote is out to eat you for dinner >","        < and all you have is a screwdriver to defend yourself.                       >");
                do
                {
                    System.out.println("Would you fight the Cayote with the Screw driver or throw it at Cayote ?");
                    System.out.print("1) FIGHT     2) THROW                                        :     ");
                    UserDecision24 = keyedInput.nextLine().toUpperCase();
                } while (!UserDecision24.matches ("FIGHT|THROW|1|2"));   
                
                //Decision 24 - Decides to fight Cayote with the Screw Driver    
                if (UserDecision24.matches ("FIGHT|1"))
                {
                    DisplayContext("        < Fighting is a brave option u chose and succeeded as well. But unfortunately >","        < you had some serious injuries. Looks like there is a village near by.       >");
                    do
                    {
                        System.out.println("Do you approach the Villagers or Continue with injury ?");
                        System.out.print("1) APPROACH VILLAGERS   2) CONTINUE WITH INJURY              :     ");
                        UserDecision25= keyedInput.nextLine().toUpperCase();
                    } while (!UserDecision25.matches ("APPROACH VILLAGERS|CONTINUE WITH INJURY|1|2"));
                    
                    //Decision 25 - Approaches Villagers to get the injury treated    
                    if (UserDecision25.matches ("APPROACH VILLAGERS|1"))
                    {
                        DisplayContext("        < After seeking villagers help, they noticed how serious your wounds are and  >","        < offered you some choices for cure                                           >");
                        do
                        {
                            System.out.println("Do you want to take medicine or undergo surgery ?");
                            System.out.print("1) MEDICINE   2) SURGERY                                     :     ");
                            UserDecision26= keyedInput.nextLine().toUpperCase();
                        } while (!UserDecision26.matches ("MEDICINE|SURGERY|1|2")); 
                        
                        //Decision 26 - Takes Medicine for the Pain   
                        if (UserDecision26.matches ("MEDICINE|1"))
                        {
                            System.out.println("");
                            System.out.println("The medicine helped relieve  your pain but not your physical injuries. Unfortunately");
                            System.out.println("you had serious infection and DIED. RIP");
                            System.out.println("");
                            System.out.println("                                **** THE END ****                                  ");
                            System.out.println("");  
                        }
                        //else for Decision 26 - Undergoes Surgery to get the injury treated by Villagers
                        else
                        {
                            DisplayContext("        < Thanks to Villagers expertise in medicine, your surgery was successful. But >","        < you do not have enough money to pay for the surgery.                        >");
                            do
                            {
                                System.out.println("As you dont have any money, do you want to run away or tell the villagers ?");
                                System.out.print("1) RUN AWAY   2) TELL VILLAGERS                              :     ");
                                UserDecision27= keyedInput.nextLine().toUpperCase();
                            } while (!UserDecision27.matches ("RUN AWAY|TELL VILLAGERS|1|2")); 
                            
                            //Decision 27 - As a coward, decides to Run Away from those who helped him
                            if (UserDecision27.matches ("RUN AWAY|1"))
                            {
                                System.out.println("");
                                System.out.println("Running away was a terrible decision as it is simply a crime. You ended up getting ");
                                System.out.println("caught by the village guards and sentenced to the death sentence. You DIED, RIP.   ");
                                System.out.println("");
                                System.out.println("                                **** THE END ****                                  ");
                                System.out.println("");  
                            }
                            //else for Decision 27 - Bravely, tells the Villagers of the situation
                            else
                            {
                                System.out.println("");
                                System.out.println("The villagers were nice enough to allow you to continue on with your journey without");
                                System.out.println("paying. They provided assistance to get you out of the rainforest. You SURVIVED!    ");
                                System.out.println("");
                                System.out.println("                                **** THE END ****                                   ");
                                System.out.println("");     
                            } 
                        }   
                    }
                    //else for Decision 25 - Decides to continue the journey with injury    
                    else
                    {
                        System.out.println("");
                        System.out.println("Trying to continue the journey with those injuries was not a great choice. You finally");
                        System.out.println("succumbed to injuries and could not move forward. YOU DIED. RIP                       ");
                        System.out.println("");
                        System.out.println("                                **** THE END ****                                     ");
                        System.out.println("");  
                    }
                }
                //else for Decision 24 - Decides to throw the Screw Driver to scare the Cayote
                else
                {
                    System.out.println("");
                    System.out.println("You hit the coyote in the face with the screwdriver but it was not enough to take ");
                    System.out.println("it down. The coyote jumped on you, and devours you as a snack. You Died, RIP.     ");
                    System.out.println("");
                    System.out.println("                                **** THE END ****                                 ");
                    System.out.println("");
                }  
            }
        }
    }

    public static void River() {
        
        //User defined function to be called if the User Picks the River to travel across Rainforest
        
        Scanner keyedInput = new Scanner (System.in);  
        
        // String variables declared to store the User Decisions
        String UserDecision28;
        String UserDecision29;
        String UserDecision30;
        String UserDecision31;
        String UserDecision32;
        String UserDecision33;
        String UserDecision34;
        String UserDecision35;
   
        DisplayContext("        < Now that you have picked the river, you must decide between going over the  >","        < bridge or taking a boat for a ride in the river.                            >");
        do
        {
            System.out.println("Do you want to take a Bridge or Boat ?");  
            System.out.print("1) BRIDGE     2) BOAT                                        :     ");
            UserDecision28 = keyedInput.nextLine().toUpperCase();
        } while (!UserDecision28.matches ("BRIDGE|BOAT|1|2"));
        
        //Decision 28 - Picks Bridge route to cross the River
        if (UserDecision28.matches ("BRIDGE|1"))
        {
            DisplayContext("        < The bridge is old and broken. The middle tiles of the bridge are completely >","        < gone and the whole bridge looks cracked.                                    >");
            do
            {
                System.out.println("Do you want to Jump over the crack or cross using old Railing ?");
                System.out.print("1) JUMP     2) RAILING                                       :     ");
                UserDecision29 = keyedInput.nextLine().toUpperCase();
            } while (!UserDecision29.matches ("JUMP|RAILING|1|2"));
            
            //Decision 29 - Tries to Jump over the crack, to cross the bridge
            if (UserDecision29.matches ("JUMP|1"))
            {
                DisplayContext("        < You successfully made it over the crack of the bridge after jumping. But as >","        < you approached the end of the bridge, there is a snake staring at you.      >");
                do
                {
                    System.out.println("Would you fight the snake or run past the snake ?");
                    System.out.print("1) FIGHT     2) RUN PAST                                     :     ");
                    UserDecision30 = keyedInput.nextLine().toUpperCase();
                } while (!UserDecision30.matches ("FIGHT|RUN PAST|1|2"));
                
                //Decision 30 - Decides to fight the Snake  
                if (UserDecision30.matches ("FIGHT|1"))
                {
                    DisplayContext("        < You DEFEATED the snake but not without some bites. The snake was also       >","        < poisonous and now you are in serious trouble.                               >");
                    do
                    {
                        System.out.println("Would you need medical help or continue the journey with snake bite ?");
                        System.out.print("1) MEDICAL HELP     2) CONTINUE JOURNEY                      :     ");
                        UserDecision31= keyedInput.nextLine().toUpperCase();
                    } while (!UserDecision31.matches ("MEDICAL HELP|CONTINUE JOURNEY|1|2"));
                    
                    //Decision 31 - Wants to get Medical Help for the snake bite
                    if (UserDecision31.matches ("MEDICAL HELP|1"))
                    {
                        System.out.println("");
                        System.out.println("You found some experienced adventurers lurking in the rainforest and they knew ");
                        System.out.println("exactly how to treat your injury. With their help, you SURVIVED and was able to");
                        System.out.println("come out of the rainforest to safety. YOU SURVIVED.");
                        System.out.println("");
                        System.out.println("                                **** THE END ****                              ");
                        System.out.println("");
                    }
                    //else for Decision 31 - Wants to Continue journey inspite of the snake bite
                    else
                    {
                        System.out.println("");
                        System.out.println("Continuing your journey without treating your wounds was not the smartest choice  ");
                        System.out.println("as your injuries started getting more serious. Your body started turning blue and ");
                        System.out.println("you died of venom poison. RIP                                                     ");
                        System.out.println("");
                        System.out.println("                                **** THE END ****                                 ");
                        System.out.println("");   
                    }
                }
                //else for Decision 30 - Decides to run away from the Snake
                else
                {
                    System.out.println("");
                    System.out.println("Running past the snake was a smart move, as it was not fast enough to catch upto");
                    System.out.println("you, and your adrenaline being so much higher allowed you to make all the right ");
                    System.out.println("calls to exit the rainforest. YOU SURVIVED                                      ");
                    System.out.println("");
                    System.out.println("                                **** THE END ****                               ");
                    System.out.println(""); 
                }
            }
            //else for Decision 29 - Preferred to use the Old Railing, to pass the Bridge
            else
            {
                System.out.println("");
                System.out.println("The railing seemed to be very unstable and cracked, and when you hopped on top  ");
                System.out.println("of it, it immediately crumbled. This caused you to plummet into the water and   ");
                System.out.println("drowned. You Died, RIP.                                                         ");
                System.out.println("");
                System.out.println("                                **** THE END ****                               ");
                System.out.println("");
            } 
        }
        //else for Decision 28 - Picks Boat ride to cross the River
        else
        {
            DisplayContext("        < While riding the boat, you noticed that it is very old and broken. You      >","        < realized that water is already seeping through a crack.                     >");
            do
            {
                System.out.println("Would you try to fix the boat leak or swim?");
                System.out.print("1) TRY FIXING LEAK     2) SWIM                           :     ");
                UserDecision32 = keyedInput.nextLine().toUpperCase();
            } while (!UserDecision32.matches ("TRY FIXING LEAK|SWIM|1|2"));
            
            //Decision 32 - Decides to fix the leak to continue with boat ride
            if (UserDecision32.matches ("TRY FIXING LEAK|1"))
            {
                DisplayContext("        < After fixing the boat leak, the boat starts to leak again, and you realized >","        < that you did not fix it properly. You are left with a split decision choice.>");
                do
                {
                    System.out.println("Do you want to continue boating with leak or focus on fixing?");
                    System.out.print("1) BOATING WITH LEAK     2) TRY FIXING LEAK                  :     ");
                    UserDecision33 = keyedInput.nextLine().toUpperCase();
                } while (!UserDecision33.matches ("BOATING WITH LEAK|TRY FIXING LEAK|1|2"));
                
                //Decision 33 - Due to several leaks, decides to continue boating with the leak
                if (UserDecision33.matches ("BOATING WITH LEAK|1"))
                {
                    System.out.println("");
                    System.out.println("Boating with the leak left you helpless in the river as the boat overfilled with");
                    System.out.println("water and then broke down. You ended up drowning to death. RIP                  ");
                    System.out.println("");
                    System.out.println("                                **** THE END ****                               ");
                    System.out.println("");   
                }
                //else for Decision 33 - Continues fixing the leak, as that is the only way to go across the river
                else
                {
                    System.out.println("");
                    System.out.println("You have successfully fixed the leak and made it out of the rainforest. Following ");
                    System.out.println("a river usually leads you to a road or trail. For you, it led you to a road on the");
                    System.out.println("outside of the rainforest. YOU SURVIVED ");
                    System.out.println("");
                    System.out.println("                                **** THE END ****                                 ");
                    System.out.println("");   
                }  
            }
            //else for Decision 32 - Decides to Swim in the river to avoid fixing the boat
            else
            {   
                DisplayContext("        < Since you are an experienced swimmer, it worked out perfectly for you. But  >","        < how far you want to reach                                                   >");
                do
                {
                    System.out.println("Would you want to swim to near shore or coninue down the river ?");
                    System.out.print("1) NEARBY SHORE     2) CONTINUE                           :     ");
                    UserDecision34 = keyedInput.nextLine().toUpperCase();
                } while (!UserDecision34.matches ("NEARBY SHORE|CONTINUE|1|2"));  
                
                //Decision 34 - Decides to Swim to nearby shore to safety    
                if (UserDecision34.matches ("NEARBY SHORE|1"))
                {
                    DisplayContext("        < You have managed to swim across the river to a nearby shore. The shore is   >","        < another part of rain forest, what would be your next move?               >");
                    do
                    {
                        System.out.println("Do you want to wait for help or start trekking in the forest ?");
                        System.out.print("1) WAIT FOR HELP   2) START TREKKING                         :     ");
                        UserDecision35= keyedInput.nextLine().toUpperCase();
                    } while (!UserDecision35.matches ("WAIT FOR HELP|START TREKKING|1|2"));
                    //Decision 35 - Decides to wait for help, before proceeding
                    if (UserDecision35.matches ("WAIT FOR HELP|1"))
                    {
                        System.out.println("");
                        System.out.println("Patience paid off. A group behind you saw you lying there on the shore and ");
                        System.out.println("provided you with assistance. They allowed you to trek with them and you   ");
                        System.out.println("managed to make it out of the rainforest with them. YOU SURVIVED ");
                        System.out.println("");
                        System.out.println("                                **** THE END ****                          ");
                        System.out.println("");   
                    }
                    //else for Decision 35 - Decides to continue trekking to get out of the forest
                    else
                    {
                        System.out.println("");
                        System.out.println("You should not have let your ego get the best of you. You got lost in the ");
                        System.out.println("rainforest and died of hunger and dehydration. RIP                        ");
                        System.out.println("");
                        System.out.println("                                **** THE END ****                         ");
                        System.out.println("");   
                    } 
                }
                //else for Decision 34 - Decides to continue swimming till he gets out of rainforest
                else
                {
                    System.out.println("");
                    System.out.println("While trying to swim nonstop in the river to reach the outside of the rainforest, ");
                    System.out.println("you ended up getting tired/hungry. You eventually panicked & drowned to death. RIP");
                    System.out.println("");
                    System.out.println("                                **** THE END ****                         ");
                    System.out.println(""); 
                } 
            }
        } 
    }
    
    public static void DisplayContext(String Str1, String Str2) { 
        
        //User defined function to be called from several places, for displaying the Context before each question asked to the user
        System.out.println("");
        System.out.println("        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(Str1);
        System.out.println(Str2);
        System.out.println("        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
    }
}