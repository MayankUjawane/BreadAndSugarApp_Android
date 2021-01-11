package com.example.breadnsugar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Recipe extends AppCompatActivity {

    ArrayList<String> nameList, recipeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        nameList = new ArrayList<>();
        recipeList = new ArrayList<>();

        nameList.add("Choco Truffle Cake");
        nameList.add("Strawberry Cake");
        nameList.add("Chocolate Doughnut");
        nameList.add("Caramel Doughnut");
        nameList.add("Choco Chip Muffin");
        nameList.add("Almond Muffin");

        recipeList.add("  PROCEDURE\n \n" +
                "•\tIn a large saucepan, cook milk, butter and chocolate over low heat until melted. Remove from the heat; let stand for 10 minutes.\n" +
                "•\tPreheat oven to 325°. In a large bowl, beat eggs and vanilla; stir in chocolate mixture until smooth. Combine flour, sugar, baking soda and salt; gradually add to chocolate mixture and mix well (batter will be thin).\n" +
                "•\tTransfer to three greased and floured 9-in. round baking pans. Bake until a toothpick inserted in center comes out clean, 25-30 minutes. Cool 10 minutes before removing from pans to wire racks to cool completely.\n" +
                "•\tFor filling, in a small saucepan, melt butter and chocolate. Stir in confectioners' sugar and heavy whipping cream until smooth.\n" +
                "•\tFor ganache, place chocolate in a small bowl. In a small saucepan, bring cream just to a boil. Pour over chocolate; whisk until smooth. Cool, stirring occasionally, until ganache reaches a spreading consistency.\n" +
                "•\tPlace one cake layer on a serving plate; spread with half of the filling. Repeat layers. Top with remaining cake layer. Spread ganache over top and sides of cake. Store in the refrigerator.\n");
        recipeList.add("  PROCEDURE\n \n" +
                "•\tGrease a 8 to 10 cm cake pan with oil and dust with flour. Set aside. Preheat oven to 180 degree C.\n" +
                "•\tTake all purpose flour, baking soda, baking powder and salt in a bowl and mix well. Set aside.\n" +
                "•\tTake strawberries in a blender and puree till smooth. Set aside.\n" +
                "•\tTake sugar, oil, yogurt in a bowl and mix well till creamy.\n" +
                "•\tAdd in strawberry puree and mix well.\n" +
                "•\tAdd the flour mix and fold gently. Spoon this into the cake pan and bake for 20 to 25 mins.\n" +
                "•\tRemove from oven and cool completely.\n" +
                "•\tNow slice them in half and decorate with your favourite frosting.\n" +
                "•\tServe.\n");
        recipeList.add("  PROCEDURE\n \n" +
                "•\tMelt the chocolate and butter together in a saucepan over a medium heat.\n" +
                "•\tStir in the cocoa powder, sugar, and vanilla extract.\n" +
                "•\tTake off the heat and whisk in the eggs one at a time.\n" +
                "•\tTear off a piece of greaseproof paper and scrunch into a small ball.\n" +
                "•\tPre-heat the oven to 350°F (180°C).\n" +
                "•\tPlace the the paper balls in the centre of each hole in a muffin tin. Pour the chocolate doughnut mixture in the muffin tin holes, circling around the paper balls and being careful not to cover them.\n" +
                "•\tBake in the oven for 8-10 minutes.\n" +
                "•\tCarefully take the doughnuts out of the muffin tin. Take out the paper balls with your fingers. You should have a circle-shaped hole in each doughnut.\n" +
                "•\tDip in some melted chocolate, followed by some sprinkles.\n" +
                "•\tEnjoy!\n");
        recipeList.add("  PROCEDURE\n \n" +
                "•\tIn a medium saucepan, heat the butter and brown sugar over medium heat. Cook, stirring frequently, until the sugar is fully dissolved, and then stir in the cream. Transfer the mixture to a medium bowl, and whisk in the confectioners’ sugar, vanilla, and salt until smooth. Add more cream, if needed, to make a thinner glaze or additional confectioners’ sugar to make it thicker.\n" +
                "•\tPlace a wire rack over a baking sheet. Working one at a time, dip each doughnut top side down into the glaze, and lift up, allowing the excess to drip back into the bowl. Invert the doughnuts onto the rack, and let sit for at least 15 minutes to allow the glaze to set.\n" +
                "•\tAfter glazing, doughnuts can be topped with decorative sugars, sprinkles, chopped nuts, chocolate shavings, or toasted coconut. Toppings should be applied while the glaze is still wet so that they stick.\n" +
                "•\tFor a multiple-glaze effect, let the caramel glaze set up, about 15 minutes. Then drizzle fruit glaze, chocolate glaze, or vanilla glaze over the doughnut, or dip part of the doughnut into the second glaze.\n");
        recipeList.add("  PROCEDURE\n \n" +
                "•\tHeat oven to 400 degrees F (205 degrees C). Grease bottoms only of 12 muffin cups or line with baking cups.\n" +
                "•\tIn a medium bowl, combine flour, 1/2 cup sugar, baking powder, chocolate chips, and salt; mix well. In a small bowl, combine milk, oil and egg; blend well. Add dry ingredients all at once; stir just until dry ingredients are moistened (batter will be lumpy.)\n" +
                "•\tFill cups 2/3 full. Sprinkle tops of muffins before baking with a combination of 3 tablespoons sugar and 2 tablespoon brown sugar.\n" +
                "•\tBake for 20 to 25 minutes or until toothpick inserted in center comes out clean. Cool 1 minute before removing from pan. Serve warm.\n");
        recipeList.add("  PROCEDURE\n \n" +
                "•\tPreheat oven to 375 degrees F.\n" +
                "•\tLightly grease 12 medium or 9 count large muffin tin or line with muffin papers.\n" +
                "•\tSift together the flour, sugar, baking powder, salt, and baking soda in one bowl.\n" +
                "•\tUse a box grater to grate the almond paste into the flour mixture, then use your finger tips to work it through.\n" +
                "•\tIn a separate bowl, beat together the butter, yogurt, zest, extract, and egg until well blended.\n" +
                "•\tAdd the dry ingredients and mix together just until mixed. (If adding berries, add at this time)\n" +
                "•\tSpoon the batter into the prepared tin and sprinkle the top with the slivered almonds.\n" +
                "•\tBake for 18 to 20 minutes until light golden brown and set.\n" +
                "•\tCool to room temperature, then lightly dust with powdered sugar before serving\n");

        String cakeName = getIntent().getStringExtra("item");

        int index = nameList.indexOf(cakeName);
        String recipe = recipeList.get(index);
        TextView tv_name, tv_recipe;
        tv_name = findViewById(R.id.r_name);
        tv_recipe = findViewById(R.id.r_recipe);
        tv_name.setText(cakeName);
        tv_recipe.setText(recipe);

    }
}