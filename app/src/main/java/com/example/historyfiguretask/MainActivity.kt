package com.example.historyfiguretask

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    //declaration
    private var edtAge: EditText? = null
    private var etOutput: TextView? = null
    private var strAge = ""
    private var ageInt = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    //linking from screen
        edtAge = findViewById<EditText>(R.id.edtText)
        etOutput = findViewById<TextView>(R.id.OutputTXT)
        val Loadbtn = findViewById<Button>(R.id.btnLoad)
        val clearButton = findViewById<Button>(R.id.btnClear)

    Loadbtn.setOnClickListener{ageTest()}//<---getting button press and running class

    clearButton.setOnClickListener { clearScreen() } //<---Getting button press and clearing screen



    }//end of override



    private fun ageTest() {
        //Logic test for age

        strAge = edtAge?.text.toString()
        try { // returns Any
            ageInt = edtAge?.text.toString().toInt()

        if (strAge.isNotEmpty())// if #1
        {

            when (ageInt) {//when#1

                20 -> {etOutput?.text="Évariste Galois\n\n" +
                        "A French mathematician most notably remembered for solving a 350-year-old math problem when he was still a teen. His work formed the basis for group theory and Galois theory.\n"}

                21 -> {etOutput?.text="Napolean II\n\n" +
                        "Napoléon-François-Charles-Joseph Bonaparte, duke von Reichstadt was the titular Emperor of the French for a few weeks in 1815. He was just a small child when he became the disputed emperor following his father’s abdication\n"}

                22 -> {etOutput?.text="Beatrice Cenci\n\n" +
                        "Beatrice was the daughter of Francesco Cenci, a vicious and violent Roman nobleman of great wealth and influence. She planned the murder of her father, assassinating him on the 9th of September 1598\n"}
                23 -> {etOutput?.text="Bhagat Singh\n\n" +
                        "Bhagat Singh is one of the most revered freedom fighters of the Indian Independence movement. His execution by the British rulers at a young age of 23 inspired loads young people to join the freedom struggle for India.\n"}
                24 -> {etOutput?.text="Sacagawea\n\n" +
                        "Sacagawea was a Lemhi Shoshone woman who became a significant part of the Lewis and Clark Expedition by helping its members connect with the Native Americans along the trail\n\n"}
                25 -> {etOutput?.text="John Keats\n\n" +
                        "He was one of the leading 19th-century Romantic poets, along with Byron and Shelley, known for his natural imagery and emotions in his poems.\n"}
                26 -> {etOutput?.text="Edmund II\n\n" +
                        "Edmund Ironside was King of the English who reigned from 23 April to 30 November 1016.\n"}
                27 -> {etOutput?.text="Ahmed I\n\n" +
                        "Ahmed I reigned as the Sultan of the Ottoman Empire from 1603 till 1617. He ended the Ottoman tradition of royal fratricide when taking over the throne.\n"}
                28 -> {etOutput?.text="Caligula\n\n" +
                        "Caligula, the third Roman emperor, is often described as a cruel man who forced his subjects to worship him as their god.\n"}
                29 -> {etOutput?.text="Anne Boleyn\n\n" +
                        "The queen of England from 1533 to 1536, Anne Boleyn played an important role in the political and religious upheaval that led to the beginning of the English Reformation\n"}
                30 -> {etOutput?.text="Nero\n\n" +
                        "Nero was the fifth Roman emperor whose rule was associated with tyranny.\n"}
                31 -> {etOutput?.text="Commodus\n\n" +
                        "Commodus ruled Rome as an emperor, with his father Marcus Aurelius, from 176 till 180, and then as a sole ruler till 192.\n"}
                32-> {etOutput?.text="Bruce lee\n\n" +
                        "An iconic actor and martial artist, Bruce Lee, in his short life, gained international fame and developed his own form of martial arts\n"}
                33 -> {etOutput?.text="Germanicus \n\n" +
                        "Germanicus Julius Caesar, son of Nero Claudius and Antonia the Younger, was a Roman general. \n"}
                34 -> {etOutput?.text="Ayrton Senna\n\n" +
                        "Ayrton Senna was a Brazilian racing driver. Widely considered one of the greatest F1 drivers of all time\n"}
                35 -> {etOutput?.text="Wolfgang Amadeus Mozart\n\n" +
                        "A child prodigy, Wolfgang Amadeus Mozart is regarded as one of the greatest classical composers ever.\n"}


                36 -> {etOutput?.text="Ada Lovelace\n\n" +
                        "Ada Lovelace was a mathematician known for her work on the Analytical Engine, a mechanical general-purpose computer proposed by Charles Babbage.\n"}
                37 -> {etOutput?.text="Vincent van Gogh\\nn" +
                        "Vincent van Gogh was a Dutch post-impressionist painter and is said to be one of the most famous and influential figures in the history of Western art.\n"}
                38 -> {etOutput?.text="Caravaggio\n\n" +
                        "Italian painter Michelangelo Merisi da Caravaggio is best remembered for his influence on the Baroque style of painting.\n"}
                39 -> {etOutput?.text="Cleopatra\n\n" +
                        "She was an Egyptian queen most famous in history and drama as the lover of Julius Caesar and later as the wife of Mark Antony.\n"}
                40 -> {etOutput?.text="Edward IV\n\n" +
                        "The King of England for several years from 1461 until his death in 1483\n"}
                41 -> {etOutput?.text="Richard I \n\n" +
                        "Richard I of England, the king of England from 1189 to 1199, was known as Richard the Lionheart, for his military prowess\n"}
                42 -> {etOutput?.text="Elvis Presley\n\n" +
                        "The King of Rock ‘n’ Roll, winner of 3 Grammys, and pioneer of the Pelvis move\n"}
                43 -> {etOutput?.text="Edward II of England\n\n" +
                        "Edward II was the king of England from 1307 till his deposition in 1327.\n"}
                44 -> {etOutput?.text="Anton Chekhov\n\n" +
                        "Anton Chekhov was a Russian short-story writer and playwright. Widely regarded as one of the greatest writers of short fiction\n"}
                45 -> {etOutput?.text="Freddie Mercury\n\n" +
                        "Legendary singer, songwriter and lead vocalist of the British rock band, Queen\n"}
                46 -> {etOutput?.text="John F. Kennedy\n\n" +
                        "The 35th President of the United States\n"}
                47 -> {etOutput?.text="Simon Bolivar\n\n" +
                        "After losing his parents as a child, Simon Bolivar also lost his Spanish wife to yellow fever later and thus decided to devote himself to politics. He was the first president of Gran Colombia and Bolivia\n"}
                48 -> {etOutput?.text="James Maxwell\n\n" +
                        "Scottish physicist James Maxwell’s contributions included the formulation of the classical theory of electromagnetic radiation and the production of the first light-fast color photograph.\n"}
                49 -> {etOutput?.text="Alexander Hamilton\n\n" +
                        "Known as America’s one of the most influential Founding Fathers, Alexander Hamilton was a delegate to the Constitutional Convention and served as the first secretary of the treasury\n"}
                50 -> {etOutput?.text="Michael Jackson\n\n" +
                        "The King of Pop and an international superstar, Michael Jackson was a musical entertainer whose work\n"}
                51 -> {etOutput?.text="Napoleon Bonaparte\n\n" +
                        "French military leader Napoleon Bonaparte ruled as the French emperor from 1804 to 1814 and again in 1815\n"}
                52 -> {etOutput?.text="Peter the Great\\nn" +
                        "Peter the Great ruled the Tsardom of Russia, and then the Russian Empire, from 1682 to 1725\n"}
                53 -> {etOutput?.text="Mary Shelley\n\n" +
                        "An author who was admired for her exploration of the Gothic genre, Mary Shelley is best remembered for her novel Frankenstein.\n"}
                54 -> {etOutput?.text="Christopher Columbus\n\n" +
                        "An Italian explorer, Christopher Columbus, wanted to discover a direct water route from Europe to Asia.\n"}
                55->{etOutput?.text="Joan of Arc\n\n" +
                        "heroine of France who led the French army to victory at Orléans that got " +
                        "rid of the English who attempted to conquer France during the Hundred Years’ War\n"}
                56-> {etOutput?.text="Tutankhamun\n\n" +
                        "Tutankhamun was an Egyptian pharaoh who ruled between 1334 and 1325 BC. " +
                        "He is one of the most studied ancient Egyptian pharaohs, thanks to his well-preserved tomb." +
                        " Although he was not a popular ruler, " +
                        "the global exhibitions of artifacts associated with him have made Tutankhamun the most renowned pharaoh in the modern world.\n"}
                57 -> {etOutput?.text="Friedrich Nietzsche\n\n" +
                        "German philosopher, cultural critic, composer, and poet Friedrich Nietzsche has had a profound influence on modern intellectual history.\n"}
                58 -> {etOutput?.text="Abraham Lincoln\n\n" +
                        "A self-educated lawyer, Abraham Lincoln rose from modest background to become one of the greatest presidents of America.\n"}
                59 -> {etOutput?.text="Amerigo Vespucci\n\n" +
                        "Amerigo Vespucci was a merchant, navigator, and explorer. Credited with participating in two major voyages of the Age of Discovery\n"}
                60 -> {etOutput?.text="Charles Dickens\n\n" +
                        "Widely considered the greatest novelist of the Victorian era, Charles Dickens was an English writer famous for creating world-renowned fictional characters.\n"}



                else -> {
                    etOutput?.text = null
                    edtAge?.error= "Invalid Age"
                }
            }//end of when#1


        }//end of if #1
        else//#1
        {
            edtAge?.error= "Enter an Age"
            etOutput?.text = null

        }//else#1
        } catch(e: NumberFormatException) {
            etOutput?.text = null
            edtAge?.error= "Must Be a Number"

            if((edtAge?.text == null) || (edtAge?.text.toString() == "")){

                edtAge?.error= "cannot be blank"
            }
        }



    }//end of AgeTest class
    private fun clearScreen() {

        etOutput?.text = null
        edtAge?.text = null


    }

}//end of main class


