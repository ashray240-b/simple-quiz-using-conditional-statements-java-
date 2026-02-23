package com.gqt.corejava.project1;
import java.util.Scanner;


public class finnal {
	public static final String GREEN = "\u001B[32m";
	public static final String RED   = "\u001B[31m";
	public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ur name:");
        String nm = sc.next();
        System.out.println("Enter ur age:");
        int age = sc.nextInt();

        int lifeline = 2;
        boolean l1 = true; // 50-50 availability
        boolean l2 = true; // Audience Poll availability
        int amt = 0;
        String ans; 

        System.out.println("Welcome, " + nm + " to the quiz!");

   
        System.out.println("\nQuestion 1: Java");
        System.out.println("What is Java?");
        System.out.println("a. Prog lang");
        System.out.println("b. Subject");
        System.out.println("c. Machine");
        System.out.println("d. None of these");
        System.out.println("e. Lifeline");
        System.out.print("Your answer: ");
        ans = sc.next();

        // --- LEVEL 1: First Lifeline Check ---
        if (ans.equalsIgnoreCase("e")) {
            if (lifeline > 0) {
                System.out.println("Choose lifeline: a.50-50 | b.Audience Poll");
                String ll = sc.next();
                if (ll.equalsIgnoreCase("a") && l1) {
                    l1 = false; lifeline--;
                    System.out.println(">> 50-50 USED: a. Prog lang \n d. None");
                } else if (ll.equalsIgnoreCase("b") && l2) {
                    l2 = false; lifeline--;
                    System.out.println(">> POLL USED: a:75% \n b:10% \n c:10% \n d:5%");
                } else { System.out.println(">> Lifeline already used or invalid choice."); }

                System.out.print("Enter answer (or 'e' for remaining lifeline): ");
                ans = sc.next();

                // --- LEVEL 2: Second Lifeline Check (Nested) ---
                if (ans.equalsIgnoreCase("e")) {
                    if (lifeline > 0) {
                        System.out.println("Choose remaining lifeline: a.50-50 | b.Audience Poll");
                        ll = sc.next();
                        if (ll.equalsIgnoreCase("a") && l1) {
                            l1 = false; lifeline--;
                            System.out.println(">> 50-50 USED: a. Prog lang | d. None");
                        } else if (ll.equalsIgnoreCase("b") && l2) {
                            l2 = false; lifeline--;
                            System.out.println(">> POLL USED: a:75% | b:10% | c:10% | d:5%");
                        } else { System.out.println(">> Lifeline already used or invalid choice."); }
                        
                        System.out.print("Enter FINAL answer: ");
                        ans = sc.next();
                    } else { System.out.println(">> No lifelines left! Enter answer:"); ans = sc.next(); }
                }
            } else { System.out.println(">> No lifelines left! Enter answer:"); ans = sc.next(); }
        }

        if (ans.equalsIgnoreCase("a")) {
            System.out.println(GREEN+"Correct! You won ₹100"+RESET);
            amt += 100;
            System.out.println("Total Amount: " + amt);
        } else {
            System.out.println(RED+"Incorrect! Game Over."+RESET); return;
        }

        // =========================================================
        // QUESTION 2: Sports
        // =========================================================
        System.out.println("\nQuestion 2: Sports");
        System.out.println("Who won the ICC Men's Cricket World Cup 2011?");
        System.out.println("a. Australia");
        System.out.println("b. Sri Lanka");
        System.out.println("c. India");
        System.out.println("d. England");
        System.out.println("e. Lifeline");
        System.out.print("Your answer: ");
        ans = sc.next();

        if (ans.equalsIgnoreCase("e")) {
            if (lifeline > 0) {
                System.out.println("Choose lifeline: a.50-50 | b.Audience Poll");
                String ll = sc.next();
                if (ll.equalsIgnoreCase("a") && l1) {
                    l1 = false; lifeline--;
                    System.out.println(">> 50-50 USED: c. India | d. England");
                } else if (ll.equalsIgnoreCase("b") && l2) {
                    l2 = false; lifeline--;
                    System.out.println(">> POLL USED: a:15% | b:20% | c:60% | d:5%");
                } else { System.out.println(">> Lifeline already used."); }

                System.out.print("Enter answer (or 'e' for remaining lifeline): ");
                ans = sc.next();

                if (ans.equalsIgnoreCase("e")) {
                    if (lifeline > 0) {
                        System.out.println("Choose remaining lifeline: a.50-50 | b.Audience Poll");
                        ll = sc.next();
                        if (ll.equalsIgnoreCase("a") && l1) {
                            l1 = false; lifeline--;
                            System.out.println(">> 50-50 USED: c. India | d. England");
                        } else if (ll.equalsIgnoreCase("b") && l2) {
                            l2 = false; lifeline--;
                            System.out.println(">> POLL USED: a:15% | b:20% | c:60% | d:5%");
                        } else { System.out.println(">> Lifeline already used."); }
                        System.out.print("Enter FINAL answer: "); ans = sc.next();
                    } else { System.out.println(">> No lifelines left! Answer:"); ans = sc.next(); }
                }
            } else { System.out.println(">> No lifelines left! Answer:"); ans = sc.next(); }
        }

        if (ans.equalsIgnoreCase("c")) {
            System.out.println(GREEN +"Correct! You won ₹200"+RESET);
            amt += 100;
            System.out.println("Total Amount: " + amt);
        } else {
            System.out.println(RED+"Incorrect! Game Over."+RESET); return;
        }

        // =========================================================
        // QUESTION 3: Movies
        // =========================================================
        System.out.println("\nQuestion 3: Movies");
        System.out.println("Who is known as the Megastar of Telugu cinema?");
        System.out.println("a. Prabhas");
        System.out.println("b. Mahesh Babu");
        System.out.println("c. Chiranjeevi");
        System.out.println("d. Allu Arjun");
        System.out.println("e. Lifeline");
        System.out.print("Your answer: ");
        ans = sc.next();

        if (ans.equalsIgnoreCase("e")) {
            if (lifeline > 0) {
                System.out.println("Choose lifeline: a.50-50 | b.Audience Poll");
                String ll = sc.next();
                if (ll.equalsIgnoreCase("a") && l1) {
                    l1 = false; lifeline--;
                    System.out.println(">> 50-50 USED: c. Chiranjeevi | d. Allu Arjun");
                } else if (ll.equalsIgnoreCase("b") && l2) {
                    l2 = false; lifeline--;
                    System.out.println(">> POLL USED: a:10% | b:10% | c:70% | d:10%");
                } else { System.out.println(">> Lifeline already used."); }

                System.out.print("Enter answer (or 'e' for remaining lifeline): ");
                ans = sc.next();

                if (ans.equalsIgnoreCase("e")) {
                    if (lifeline > 0) {
                        System.out.println("Choose remaining lifeline: a.50-50 | b.Audience Poll");
                        ll = sc.next();
                        if (ll.equalsIgnoreCase("a") && l1) { l1=false; lifeline--; System.out.println(">> 50-50 USED: c. Chiranjeevi | d. Allu Arjun"); }
                        else if (ll.equalsIgnoreCase("b") && l2) { l2=false; lifeline--; System.out.println(">> POLL USED: a:10% | b:10% | c:70% | d:10%"); }
                        else { System.out.println(">> Lifeline already used."); }
                        System.out.print("Enter FINAL answer: "); ans = sc.next();
                    } else { System.out.println(">> No lifelines left! Answer:"); ans = sc.next(); }
                }
            } else { System.out.println(">> No lifelines left! Answer:"); ans = sc.next(); }
        }

        if (ans.equalsIgnoreCase("c")) {
            System.out.println(GREEN+"Correct! You won ₹300"+RESET);
            amt += 100;
            System.out.println("Total Amount: " + amt);
        } else {
            System.out.println(RED+"Incorrect! Game Over."+RESET); return;
        }

        // =========================================================
        // QUESTION 4: Education
        // =========================================================
        System.out.println("\nQuestion 4: Education");
        System.out.println("What does OOP stand for in programming?");
        System.out.println("a. Object Oriented Programming");
        System.out.println("b. Open Output Program");
        System.out.println("c. Order Of Process");
        System.out.println("d. Object Output Process");
        System.out.println("e. Lifeline");
        System.out.print("Your answer: ");
        ans = sc.next();

        if (ans.equalsIgnoreCase("e")) {
            if (lifeline > 0) {
                System.out.println("Choose lifeline: a.50-50 | b.Audience Poll");
                String ll = sc.next();
                if (ll.equalsIgnoreCase("a") && l1) {
                    l1 = false; lifeline--;
                    System.out.println(">> 50-50 USED: a. Object Oriented | d. Object Output");
                } else if (ll.equalsIgnoreCase("b") && l2) {
                    l2 = false; lifeline--;
                    System.out.println(">> POLL USED: a:85% | b:5% | c:5% | d:5%");
                } else { System.out.println(">> Lifeline already used."); }

                System.out.print("Enter answer (or 'e' for remaining lifeline): ");
                ans = sc.next();

                if (ans.equalsIgnoreCase("e")) {
                    if (lifeline > 0) {
                        System.out.println("Choose remaining lifeline: a.50-50 | b.Audience Poll");
                        ll = sc.next();
                        if (ll.equalsIgnoreCase("a") && l1) { l1=false; lifeline--; System.out.println(">> 50-50 USED: a. Object Oriented | d. Object Output"); }
                        else if (ll.equalsIgnoreCase("b") && l2) { l2=false; lifeline--; System.out.println(">> POLL USED: a:85% | b:5% | c:5% | d:5%"); }
                        else { System.out.println(">> Lifeline already used."); }
                        System.out.print("Enter FINAL answer: "); ans = sc.next();
                    } else { System.out.println(">> No lifelines left! Answer:"); ans = sc.next(); }
                }
            } else { System.out.println(">> No lifelines left! Answer:"); ans = sc.next(); }
        }

        if (ans.equalsIgnoreCase("a")) {
            System.out.println(GREEN+"Correct! You won ₹400"+RESET);
            amt += 100;
            System.out.println("Total Amount: " + amt);
        } else {
            System.out.println(RED+"Incorrect! Game Over."+RESET); return;
        }

        // =========================================================
        // QUESTION 5: Business
        // =========================================================
        System.out.println("\nQuestion 5: Business");
        System.out.println("Which company is the parent company of Google?");
        System.out.println("a. Microsoft");
        System.out.println("b. Amazon");
        System.out.println("c. Meta");
        System.out.println("d. Alphabet Inc.");
        System.out.println("e. Lifeline");
        System.out.print("Your answer: ");
        ans = sc.next();

        if (ans.equalsIgnoreCase("e")) {
            if (lifeline > 0) {
                System.out.println("Choose lifeline: a.50-50 | b.Audience Poll");
                String ll = sc.next();
                if (ll.equalsIgnoreCase("a") && l1) {
                    l1 = false; lifeline--;
                    System.out.println(">> 50-50 USED: c. Meta | d. Alphabet Inc.");
                } else if (ll.equalsIgnoreCase("b") && l2) {
                    l2 = false; lifeline--;
                    System.out.println(">> POLL USED: a:15% | b:5% | c:10% | d:70%");
                } else { System.out.println(">> Lifeline already used."); }

                System.out.print("Enter answer (or 'e' for remaining lifeline): ");
                ans = sc.next();

                if (ans.equalsIgnoreCase("e")) {
                    if (lifeline > 0) {
                        System.out.println("Choose remaining lifeline: a.50-50 | b.Audience Poll");
                        ll = sc.next();
                        if (ll.equalsIgnoreCase("a") && l1) { l1=false; lifeline--; System.out.println(">> 50-50 USED: c. Meta | d. Alphabet Inc."); }
                        else if (ll.equalsIgnoreCase("b") && l2) { l2=false; lifeline--; System.out.println(">> POLL USED: a:15% | b:5% | c:10% | d:70%"); }
                        else { System.out.println(">> Lifeline already used."); }
                        System.out.print("Enter FINAL answer: "); ans = sc.next();
                    } else { System.out.println(">> No lifelines left! Answer:"); ans = sc.next(); }
                }
            } else { System.out.println(">> No lifelines left! Answer:"); ans = sc.next(); }
        }

        if (ans.equalsIgnoreCase("d")) {
            System.out.println(GREEN+"Correct! You won ₹500"+RESET);
            amt += 100;
            System.out.println("Total Amount: " + amt);
        } else {
            System.out.println(RED+"Incorrect! Game Over."+RESET); return;
        }

        // =========================================================
        // QUESTION 6: Politics
        // =========================================================
        System.out.println("\nQuestion 6: Politics");
        System.out.println("Who is the Prime Minister of India?");
        System.out.println("a. Rahul Gandhi");
        System.out.println("b. Pawan Kalyan");
        System.out.println("c. Arvind Kejriwal");
        System.out.println("d. Narendra Modi");
        System.out.println("e. Lifeline");
        System.out.print("Your answer: ");
        ans = sc.next();

        if (ans.equalsIgnoreCase("e")) {
            if (lifeline > 0) {
                System.out.println("Choose lifeline: a.50-50 | b.Audience Poll");
                String ll = sc.next();
                if (ll.equalsIgnoreCase("a") && l1) {
                    l1 = false; lifeline--;
                    System.out.println(">> 50-50 USED: b. Pawan Kalyan | d. Narendra Modi");
                } else if (ll.equalsIgnoreCase("b") && l2) {
                    l2 = false; lifeline--;
                    System.out.println(">> POLL USED: a:10% | b:5% | c:5% | d:80%");
                } else { System.out.println(">> Lifeline already used."); }

                System.out.print("Enter answer (or 'e' for remaining lifeline): ");
                ans = sc.next();

                if (ans.equalsIgnoreCase("e")) {
                    if (lifeline > 0) {
                        System.out.println("Choose remaining lifeline: a.50-50 | b.Audience Poll");
                        ll = sc.next();
                        if (ll.equalsIgnoreCase("a") && l1) { l1=false; lifeline--; System.out.println(">> 50-50 USED: b. Pawan Kalyan | d. Narendra Modi"); }
                        else if (ll.equalsIgnoreCase("b") && l2) { l2=false; lifeline--; System.out.println(">> POLL USED: a:10% | b:5% | c:5% | d:80%"); }
                        else { System.out.println(">> Lifeline already used."); }
                        System.out.print("Enter FINAL answer: "); ans = sc.next();
                    } else { System.out.println(">> No lifelines left! Answer:"); ans = sc.next(); }
                }
            } else { System.out.println(">> No lifelines left! Answer:"); ans = sc.next(); }
        }

        if (ans.equalsIgnoreCase("d")) {
            System.out.println(GREEN+"Correct! You won ₹600"+RESET);
            amt += 100;
            System.out.println("Total Amount: " + amt);
        } else {
            System.out.println(RED+"Incorrect! Game Over."+RESET); return;
        }

        // =========================================================
        // QUESTION 7: Music
        // =========================================================
        System.out.println("\nQuestion 7: Music");
        System.out.println("Which musical instrument has black and white keys?");
        System.out.println("a. Guitar");
        System.out.println("b. Flute");
        System.out.println("c. Piano");
        System.out.println("d. Drums");
        System.out.println("e. Lifeline");
        System.out.print("Your answer: ");
        ans = sc.next();

        if (ans.equalsIgnoreCase("e")) {
            if (lifeline > 0) {
                System.out.println("Choose lifeline: a.50-50 | b.Audience Poll");
                String ll = sc.next();
                if (ll.equalsIgnoreCase("a") && l1) {
                    l1 = false; lifeline--;
                    System.out.println(">> 50-50 USED: c. Piano | b. Flute");
                } else if (ll.equalsIgnoreCase("b") && l2) {
                    l2 = false; lifeline--;
                    System.out.println(">> POLL USED: a:5% | b:5% | c:85% | d:5%");
                } else { System.out.println(">> Lifeline already used."); }

                System.out.print("Enter answer (or 'e' for remaining lifeline): ");
                ans = sc.next();

                if (ans.equalsIgnoreCase("e")) {
                    if (lifeline > 0) {
                        System.out.println("Choose remaining lifeline: a.50-50 | b.Audience Poll");
                        ll = sc.next();
                        if (ll.equalsIgnoreCase("a") && l1) { l1=false; lifeline--; System.out.println(">> 50-50 USED: c. Piano | b. Flute"); }
                        else if (ll.equalsIgnoreCase("b") && l2) { l2=false; lifeline--; System.out.println(">> POLL USED: a:5% | b:5% | c:85% | d:5%"); }
                        else { System.out.println(">> Lifeline already used."); }
                        System.out.print("Enter FINAL answer: "); ans = sc.next();
                    } else { System.out.println(">> No lifelines left! Answer:"); ans = sc.next(); }
                }
            } else { System.out.println(">> No lifelines left! Answer:"); ans = sc.next(); }
        }

        if (ans.equalsIgnoreCase("c")) {
            System.out.println(GREEN +"Correct! You won ₹700"+RESET);
            amt += 100;
            System.out.println("Total Amount: " + amt);
        } else {
            System.out.println(RED+"Incorrect! Game Over."+RESET); return;
        }

        // =========================================================
        // QUESTION 8: Social Media
        // =========================================================
        System.out.println("\nQuestion 8: Social Media");
        System.out.println("Which company owns Instagram?");
        System.out.println("a. Google");
        System.out.println("b. Twitter");
        System.out.println("c. Meta");
        System.out.println("d. Snapchat");
        System.out.println("e. Lifeline");
        System.out.print("Your answer: ");
        ans = sc.next();

        if (ans.equalsIgnoreCase("e")) {
            if (lifeline > 0) {
                System.out.println("Choose lifeline: a.50-50 | b.Audience Poll");
                String ll = sc.next();
                if (ll.equalsIgnoreCase("a") && l1) {
                    l1 = false; lifeline--;
                    System.out.println(">> 50-50 USED: b. Twitter | c. Meta");
                } else if (ll.equalsIgnoreCase("b") && l2) {
                    l2 = false; lifeline--;
                    System.out.println(">> POLL USED: a:10% | b:15% | c:70% | d:5%");
                } else { System.out.println(">> Lifeline already used."); }

                System.out.print("Enter answer (or 'e' for remaining lifeline): ");
                ans = sc.next();

                if (ans.equalsIgnoreCase("e")) {
                    if (lifeline > 0) {
                        System.out.println("Choose remaining lifeline: a.50-50 | b.Audience Poll");
                        ll = sc.next();
                        if (ll.equalsIgnoreCase("a") && l1) { l1=false; lifeline--; System.out.println(">> 50-50 USED: b. Twitter | c. Meta"); }
                        else if (ll.equalsIgnoreCase("b") && l2) { l2=false; lifeline--; System.out.println(">> POLL USED: a:10% | b:15% | c:70% | d:5%"); }
                        else { System.out.println(">> Lifeline already used."); }
                        System.out.print("Enter FINAL answer: "); ans = sc.next();
                    } else { System.out.println(">> No lifelines left! Answer:"); ans = sc.next(); }
                }
            } else { System.out.println(">> No lifelines left! Answer:"); ans = sc.next(); }
        }

        if (ans.equalsIgnoreCase("c")) {
            System.out.println(GREEN+"Correct! You won ₹800"+RESET);
            amt += 100;
            System.out.println("Total Amount: " + amt);
        } else {
            System.out.println(RED+"Incorrect! Game Over."+RESET); return;
        }

        // =========================================================
        // QUESTION 9: Science
        // =========================================================
        System.out.println("\nQuestion 9: Science");
        System.out.println("What is the chemical symbol of water?");
        System.out.println("a. O2");
        System.out.println("b. CO2");
        System.out.println("c. H2O");
        System.out.println("d. NaCl");
        System.out.println("e. Lifeline");
        System.out.print("Your answer: ");
        ans = sc.next();

        if (ans.equalsIgnoreCase("e")) {
            if (lifeline > 0) {
                System.out.println("Choose lifeline: a.50-50 | b.Audience Poll");
                String ll = sc.next();
                if (ll.equalsIgnoreCase("a") && l1) {
                    l1 = false; lifeline--;
                    System.out.println(">> 50-50 USED: a. O2 | c. H2O");
                } else if (ll.equalsIgnoreCase("b") && l2) {
                    l2 = false; lifeline--;
                    System.out.println(">> POLL USED: a:10% | b:5% | c:80% | d:5%");
                } else { System.out.println(">> Lifeline already used."); }

                System.out.print("Enter answer (or 'e' for remaining lifeline): ");
                ans = sc.next();

                if (ans.equalsIgnoreCase("e")) {
                    if (lifeline > 0) {
                        System.out.println("Choose remaining lifeline: a.50-50 | b.Audience Poll");
                        ll = sc.next();
                        if (ll.equalsIgnoreCase("a") && l1) { l1=false; lifeline--; System.out.println(">> 50-50 USED: a. O2 | c. H2O"); }
                        else if (ll.equalsIgnoreCase("b") && l2) { l2=false; lifeline--; System.out.println(">> POLL USED: a:10% | b:5% | c:80% | d:5%"); }
                        else { System.out.println(">> Lifeline already used."); }
                        System.out.print("Enter FINAL answer: "); ans = sc.next();
                    } else { System.out.println(">> No lifelines left! Answer:"); ans = sc.next(); }
                }
            } else { System.out.println(">> No lifelines left! Answer:"); ans = sc.next(); }
        }

        if (ans.equalsIgnoreCase("c")) {
            System.out.println(GREEN+"Correct! You won ₹900"+RESET);
            amt += 100;
            System.out.println("Total Amount: " + amt);
        } else {
            System.out.println(RED+"Incorrect! Game Over."+RESET); return;
        }

        // =========================================================
        // QUESTION 10: Current Affairs
        // =========================================================
        System.out.println("\nQuestion 10: Current Affairs");
        System.out.println("Which country hosted the G20 Summit 2023?");
        System.out.println("a. USA");
        System.out.println("b. India");
        System.out.println("c. China");
        System.out.println("d. Japan");
        System.out.println("e. Lifeline");
        System.out.print("Your answer: ");
        ans = sc.next();

        if (ans.equalsIgnoreCase("e")) {
            if (lifeline > 0) {
                System.out.println("Choose lifeline: a.50-50 | b.Audience Poll");
                String ll = sc.next();
                if (ll.equalsIgnoreCase("a") && l1) {
                    l1 = false; lifeline--;
                    System.out.println(">> 50-50 USED: b. India | d. Japan");
                } else if (ll.equalsIgnoreCase("b") && l2) {
                    l2 = false; lifeline--;
                    System.out.println(">> POLL USED: a:10% | b:75% | c:10% | d:5%");
                } else { System.out.println(">> Lifeline already used."); }

                System.out.print("Enter answer (or 'e' for remaining lifeline): ");
                ans = sc.next();

                if (ans.equalsIgnoreCase("e")) {
                    if (lifeline > 0) {
                        System.out.println("Choose remaining lifeline: a.50-50 | b.Audience Poll");
                        ll = sc.next();
                        if (ll.equalsIgnoreCase("a") && l1) { l1=false; lifeline--; System.out.println(">> 50-50 USED: b. India | d. Japan"); }
                        else if (ll.equalsIgnoreCase("b") && l2) { l2=false; lifeline--; System.out.println(">> POLL USED: a:10% | b:75% | c:10% | d:5%"); }
                        else { System.out.println(">> Lifeline already used."); }
                        System.out.print("Enter FINAL answer: "); ans = sc.next();
                    } else { System.out.println(">> No lifelines left! Answer:"); ans = sc.next(); }
                }
            } else { System.out.println(">> No lifelines left! Answer:"); ans = sc.next(); }
        }

        if (ans.equalsIgnoreCase("b")) {
            System.out.println(GREEN+"Correct! You won ₹1000"+RESET);
            amt += 100;
            System.out.println("Total Amount: " + amt);
        } else {
            System.out.println(RED+"Incorrect! Game Over."+RESET); return;
        }

        System.out.println(GREEN+"\nCONGRATULATIONS! You have completed the quiz with ₹" + amt+RESET);
        sc.close();
    }
}
