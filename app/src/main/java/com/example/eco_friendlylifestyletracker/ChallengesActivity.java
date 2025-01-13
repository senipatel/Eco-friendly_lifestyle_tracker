package com.example.eco_friendlylifestyletracker;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class ChallengesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenges);

        // Dummy data for challenges
        ArrayList<String> challengesList = new ArrayList<>();
        challengesList.add("1 Plant-Based Diet Week:\n" +
                "Challenge: Embrace a plant-based diet for a week, reducing your carbon footprint associated with meat consumption. Explore diverse, flavorful plant-based recipes to discover the benefits of sustainable eating."+"\n");
        challengesList.add("2 Zero-Waste Lunch Challenge:\n" +
                "Challenge: Pack your lunch using reusable containers, utensils, and a cloth napkin. Aim to generate zero waste, minimizing single-use plastics. This small change can significantly impact waste reduction and promote eco-friendly habits."+"\n");
        challengesList.add("3 Energy-Free Evening:\n" +
                "Challenge: Designate one evening per week without electronic devices or artificial lighting. Connect with nature, read a book, or engage in conversation, reducing electricity consumption and promoting a healthier, balanced lifestyle."+"\n");
        challengesList.add("4 Reusable Commuting:\n" +
                "Challenge: Opt for eco-friendly transportation modes like cycling, walking, or public transit for a month. Cut down on individual car usage to decrease air pollution and embrace sustainable commuting alternatives."+"\n");
        challengesList.add("5 Local and Seasonal Eating:\n" +
                "Challenge: Commit to consuming locally sourced and seasonal produce for a month. Support local farmers, reduce transportation-related emissions, and enjoy fresh, nutritious foods aligned with the seasons.\n" +
                "\n");
        challengesList.add("6 Water-Saving Shower Challenge:\n" +
                "Challenge: Limit your daily shower time to five minutes for a week. Conserve water, reduce energy consumption, and discover the positive impact of shorter showers on both the environment and your utility bills."+"\n");
        challengesList.add("7 Eco-Friendly Workout Routine:\n" +
                "Challenge: Opt for outdoor or home-based workouts to minimize reliance on gym equipment. Incorporate eco-conscious practices, such as using reusable water bottles and avoiding single-use plastics during exercise."+"\n");
        challengesList.add("8 Green Thumb Challenge:\n" +
                "Challenge: Start a small indoor garden using potted plants or herbs. Enhance indoor air quality, reduce stress, and experience the joy of nurturing living plants while contributing positively to the environment."+"\n");
        challengesList.add("9 Digital Detox Day:\n" +
                "Challenge: Dedicate one day to a digital detox. Turn off electronic devices, refrain from online activities, and engage in offline, nature-oriented pursuits. Rediscover the benefits of unplugging while reducing your digital carbon footprint.\n" +
                "\n");
        challengesList.add("10 Upcycling Art Project:\n" +
                "Challenge: Transform discarded items into creative, functional pieces through upcycling. This month-long challenge encourages creativity, waste reduction, and a mindful approach to repurposing materials for sustainable living."+"\n");
        challengesList.add("11 Screen-Free Sundays:\n" +
                "Challenge: Dedicate Sundays to being screen-free. Minimize the use of smartphones, computers, and televisions to reduce electronic waste and promote a mindful, tech-free day. Spend time outdoors, engage in hobbies, and connect with loved ones."+"\n");
        challengesList.add("12 Meatless Mondays for a Month:\n" +
                "Challenge: Adopt a vegetarian or vegan diet every Monday for a month. By reducing meat consumption, you contribute to lower greenhouse gas emissions associated with livestock farming and promote a more sustainable food system."+"\n");
        challengesList.add("13 Plastic-Free Personal Care:\n" +
                "Challenge: Swap out single-use plastic items in your personal care routine for a week. Choose plastic-free alternatives for toothbrushes, shampoo, soap, and other daily essentials to minimize plastic pollution and encourage sustainable product choices."+"\n");
        challengesList.add("14 30-Day Energy Audit:\n" +
                "Challenge: Conduct a month-long energy audit of your home. Identify energy-consuming habits and implement changes to reduce overall energy consumption. Install energy-efficient bulbs, unplug unused devices, and explore renewable energy options to lighten your environmental impact."+"\n");
        challengesList.add("15 Nature Journaling Challenge:\n" +
                "Challenge: Commit to daily nature journaling for two weeks. Spend time outdoors, observe the natural world, and document your thoughts, sketches, or photographs. This challenge promotes a deeper connection with nature and raises awareness about the importance of environmental conservation.\n" +
                "\n");



        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, challengesList);
        ListView listView = findViewById(R.id.listViewChallenges);
        listView.setAdapter(adapter);
    }
}
