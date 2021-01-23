package com.example.mycookbook;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    String name,name1,name2,name3,name4,name5,name6,name7,name8,name9,name10,name11,name12,name13,name14,name15;
    String desc,desc1,desc2,desc3,desc4,desc5,desc6,desc7,desc8,desc9,desc10,desc11,desc12,desc13,desc14,desc15;
    byte[] img,img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13,img14,img15;
    Bitmap imageBitmap,imageBitmap1,imageBitmap2,imageBitmap3,imageBitmap4,imageBitmap5,imageBitmap6,imageBitmap7,imageBitmap8,imageBitmap9,imageBitmap10,imageBitmap11,imageBitmap12,imageBitmap13,imageBitmap14,imageBitmap15;
    Drawable drawable,drawable1,drawable2,drawable3,drawable4,drawable5,drawable6,drawable7,drawable8,drawable9,drawable10,drawable11,drawable12,drawable13,drawable14,drawable15;
    List<Foods> myData = new ArrayList<>();
    String in,in1,in2,in3,in4,in5,in6,in7,in8,in9,in10,in11,in12,in13,in14,in15;
    String qn,qn1,qn2,qn3,qn4,qn5,qn6,qn7,qn8,qn9,qn10,qn11,qn12,qn13,qn14,qn15;
    @SuppressLint("WrongThread")
    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Objects.requireNonNull(getSupportActionBar()).hide();

        name = "Grilled peaches with burrata";
        desc = "STEP 1 To make the dressing, whisk together the olive oil, vinegar and honey in a bowl then stir in the chilli and garlic. Leave while you make the salad.\n\n STEP 2 Heat a griddle pan over a high heat. Brush the peach halves with oil then griddle until charred and caramelised on the surface.\n\n STEP 3 Scatter the rocket on a platter. Drape over the serrano ham, add the peaches and sit the burrata in the middle. Discard the garlic clove from the dressing then spoon over everything. Scatter over the basil and pine nuts, and serve with crusty bread, if you like.";
        drawable = getResources().getDrawable(R.mipmap.olive_round,getTheme());

        in = "peaches 2, ripe but firm-ish, halved and stoned\n" +
                "        olive oil" +
                "        rocket 2 handfuls\n" +
                "        serrano ham 6 slices\n" +
                "        burrata 1 ball\n" +
                "        basil a small bunch\n" +
                "        pine nuts 2 tbsp of toasted\n" +
                "        crusty bread to serve, (optional)\n";

            qn = "olive oil 3 tbsp\n" +
                    "white balsamic vinegar 2 tbsp\n" +
                    "runny honey 1 tsp\n" +
                    "red chilli 1, finely chopped\n" +
                    "garlic ½ a clove\n";
        name1= "Roasted Vegetables Antipasto Plate";
        desc1 = "Step 1\n" +
                "Preheat oven to 425°. Drain anchovies and finely chop. Smash, alternating between chopping and mashing with the side of the chef’s knife, until a thick smooth paste forms. Mix with 4 Tbsp. oil in a large bowl. Toss in cauliflower; season very lightly with salt and pepper. Spread out on a rimmed baking sheet. Toss carrots, oregano, and 2 Tbsp. oil on another rimmed baking sheet; season with salt and pepper. Place carrots on upper rack and cauliflower below and roast, tossing halfway through, until carrots are browned and crisp-tender, 14–18 minutes. Remove carrots from oven and grate lemon zest over. Move cauliflower to upper rack and continue to roast, tossing occasionally, until browned all over and tender, 15–20 minutes longer.\n" +
                "\n" +
                "Step 2\n" +
                "Meanwhile, heat 1 Tbsp. oil in a small skillet over medium. Cook panko, stirring, until golden brown. Season lightly with salt and transfer to paper towels to drain.\n" +
                "\n" +
                "Step 3\n" +
                "Just before serving, drizzle carrots with oil and toss cauliflower with breadcrumbs.\n" +
                "\n" +
                "Step 4\n" +
                "Do Ahead: Cauliflower and carrots can be roasted 3 days ahead. Let cool; cover and chill. Bring to room temperature before serving.";
        drawable1 = getResources().getDrawable(R.mipmap.images_round,getTheme());

        in1 = "tin oil-packed anchovies\n" +
                "olive oil\n" +
                "cauliflower, cut into large florets\n" +
                "Kosher salt, freshly ground pepper\n" +
                " medium carrots, scrubbed, cut on a diagonal ¾ inch thick\n" +
                "dried oregano\n" +
                "lemon\n" +
                " panko (Japanese breadcrumbs)";

        qn1 = "2-ounce tin oil-packed anchovies\n" +
                "7 tablespoons olive oil, divided, plus more for serving\n" +
                "12-pound head of cauliflower\n" +
                "Kosher salt, freshly ground pepper\n" +
                "1 pound medium carrots, scrubbed\n" +
                "½ teaspoon dried oregano\n" +
                "¼ lemon\n" +
                "¼ cup panko (Japanese breadcrumbs)";

        name2= "Sausage and Broccoli Rabe Frittata";
        desc2 = "Step 1\n" +
                "Preheat broiler. Whisk eggs and milk in a medium bowl. Mix in ½ cup cheddar; season with salt and pepper and set aside.\n" +
                "\n" +
                "Step 2\n" +
                "Heat oil in a large skillet, preferably cast-iron, over medium heat. Add onion and chorizo and cook, stirring occasionally, until onion is softened and chorizo is brown, 6–8 minutes. Add broccoli rabe; season with salt and pepper and cook, stirring occasionally, until tender, 8–10 minutes longer.\n" +
                "\n" +
                "Step 3\n" +
                "Reduce heat to low and pour reserved egg mixture over vegetables. Cook, shaking pan occasionally, until edges are just set, 10–12 minutes. Top frittata with remaining ¼ cup cheddar; broil until top is golden brown and center is set, about 4 minutes longer.\n" +
                "\n" +
                "Step 4\n" +
                "Cut frittata into wedges and serve warm or room temperature.\n" +
                "\n" +
                "Step 5\n" +
                "DO AHEAD: Frittata can be made 2 hours ahead. Let cool, then cover.";
        drawable2 = getResources().getDrawable(R.mipmap.brocli_round,getTheme());

        in2 = "large eggs\n" +
                "whole milk\n" +
                "grated cheddar, divided\n" +
                "Kosher salt and coarsely ground black pepper\n" +
                "tablespoons vegetable oil\n" +
                "medium onion, chopped\n" +
                " fresh Spanish chorizo or hot Italian sausage links, casings removed\n" +
                " bunch broccoli rabe, coarsely chopped";

        qn2 = "12 large eggs\n" +
                "½ cup whole milk\n" +
                "¾ cup grated cheddar\n" +
                "2 tablespoons vegetable oil\n" +
                "½ medium onion, chopped\n" +
                "½ pounds fresh Spanish chorizo or hot Italian sausage links\n" +
                "1 bunch broccoli rabe";
        name3= "Pasta all'Amatriciana";
        desc3 = "Step 1\n" +
                "Purée tomatoes with juices in a blender; set aside. Cook onion, guanciale, pancetta, oil, red pepper flakes, and 1/2 cup water in a large heavy pot over medium-high heat, stirring occasionally, until water is evaporated and fat begins to render, 8–10 minutes.\n" +
                "\n" +
                "Step 2\n" +
                "Add tomato paste and cook, stirring often, until beginning to brown, about 2 minutes. Add wine and cook, stirring often, until reduced by half, 5–8 minutes.\n" +
                "\n" +
                "Step 3\n" +
                "Add reserved tomato purée and bring to a boil. Cover pan partially with a lid, reduce heat, and simmer until meat is tender and flavors are melded, 40–45 minutes. Add sugar, if using; season with salt and pepper.\n" +
                "\n" +
                "Step 4\n" +
                "When sauce is almost done, cook pasta in a large pot of boiling salted water, stirring occasionally, until al dente; drain pasta.\n" +
                "\n" +
                "Step 5\n" +
                "Add pasta to sauce and toss to coat. Serve topped with Pecorino.\n" +
                "\n" +
                "Step 6\n" +
                "DO AHEAD: Sauce can be made 4 days ahead. Let cool, then chill until cold. Cover and keep chilled.";
        drawable3 = getResources().getDrawable(R.mipmap.amatriciana_round,getTheme());

        in3 = " cans whole peeled tomatoes\n" +
                "medium onion, finely chopped\n" +
                "guanciale (salt-cured pork jowl), finely chopped\n" +
                " pancetta (Italian bacon), finely chopped\n" +
                " olive oil\n" +
                " crushed red pepper flakes\n" +
                " tomato paste\n" +
                " dry white wine\n" +
                "sugar (optional)\n" +
                "Kosher salt, freshly ground pepper\n" +
                " penne or other tube-shaped pasta\n";

        qn3 = "2 28-ounce cans whole peeled tomatoes\n" +
                "4 ounces guanciale \n" +
                "4 ounces pancetta \n" +
                "1/4 cup olive oil\n" +
                "1 teaspoon crushed red pepper flakes\n" +
                "1/4 cup tomato paste\n" +
                "1 cup dry white wine\n" +
                "1 teaspoon sugar (optional)\n" +
                "1 pound penne or other tube-shaped pasta\n";
        name4= "Chicken Karahi";
        desc4 = "Step 1\n" +
                "We start by frying the chicken in a generous amount of oil. We can’t really get away from the oil here, soz.\n" +
                "Step 2\n" +
                "We than add in a LOT of minced ginger and garlic. Please none of that pre-made, jarred stuff. FRESH ginger and garlic is KEY here. Remember I said Karahis have a huge emphasis on fragrance and natural flavours? These two ingredients are a MAJOR component of that. We want to fry these just enough for the raw smell to go away – under no circumstances should you allow this to burn because it will taint the flavour of the Karahi.\n" +
                "Step 3\n" +
                "We then go ahead and add all our tomatoes and spices. The tomatoes will release TONS of moisture and will break down into a beautifully jammy, thick gravy that will coat the chicken.\n" +
                "Step 4\n" +
                "We allow this mix to cook on high, stirring as needed to make sure it doesn’t catch at the bottom of the pan. We don’t put the lid on because we are concentrating the flavour. If we put the lid on, we won’t get that true Karahi look or flavour because we will be containing the moisture in our pan, not allowing the flavours to concentrate. The result will be a boiled/steamed chicken that looks more like a red chicken shorba and will likely break/flake. Not ideal for a Karahi!\n" +
                "Step 5\n" +
                "At about the 15-20 minute mark, the gravy will have thickened nicely, the oil will be separating around the edges, the chicken will be cooked and things will be looking almost done. At this point, you can add the chopped coriander and chillis, turn the heat to low and allow everything to simmer together again without the lid. It can simmer for 5 minutes at this point";
        drawable4 = getResources().getDrawable(R.mipmap.karahi_round,getTheme());

        in4 =   "oil or ghee\n" +
                "chicken, bone in and cut into curry pieces\n" +
                "tomatoes, finely chopped\n" +
                " garlic, minced\n" +
                " ginger, minced\n" +
                " salt, or to taste\n" +
                " paprika/kashmiri red chilli\n" +
                " crushed black pepper\n" +
                " chilli flakes\n" +
                " cumin powder\n" +
                " coriander powder\n" +
                " kalonji (black seed, optional)\n" +
                " green chillis\n" +
                " coriander, chopped";

        qn4 = "1/2 cup oil or ghee\n" +
                "550g chicken\n" +
                "600g tomatoes\n" +
                "1 bulb garlic\n" +
                "2 tbsp ginger\n" +
                "2 tsp salt, or to taste\n" +
                "2 tsp paprika/kashmiri red chilli\n" +
                "1.5 tsp crushed black pepper\n" +
                "1 tsp chilli flakes\n" +
                "0.5 tsp cumin powder\n" +
                "0.5 tsp coriander powder\n" +
                "1tsp kalonji (black seed, optional)\n" +
                "2 green chillis, slit in half lengthwise\n" +
                "0.5 bunch coriander";
        name5= "Coconut Samosas";
        desc5 =  "Step 1\n" +
                "Begin with making the pastry. In a bowl, add the butter and use your fingertips to mix the butter into the flour, until it resembles breadcrumbs\n" +
                "Step 2\n" +
                "Add water, a few tbsp at a time. Use your hands to knead the dough until it forms a firm dough. Be very careful not to add too much water, as if the dough becomes too wet it will be too difficult to work with\n" +
                "Step 3\n" +
                "Allow the dough to rest, while you make the coconut and sugar filling\n" +
                "Step 4\n" +
                "Take small balls out of the dough and begin to roll them out into circles, much like making a small chapatti. Cut the circles into 4 quarters.\n" +
                "Step 5\n" +
                "Working with each quarter, shape and fill the samosas as shown in the post (source: Williams Somona) until you have finished all the dough\n" +
                "Step 6\n" +
                "Heat oil in a deep wok or pan on medium heat. Fry the samosas on medium heat, turning throughout the fry time.";
        drawable5 = getResources().getDrawable(R.mipmap.samosa_round,getTheme());

        in5 =   "For the samosa pastry\n" +
                " plain flour\n" +
                " butter\n" +
                "Water\n" +
                "For the coconut filling\n" +
                "dessicated coconut\n" +
                " white sugar\n" +
                "Other\n" +
                "Oil, for frying";

        qn5 = "2 cups plain flour\n" +
                "2 heaped tablespoons butter\n" +
                "Water, as needed\n" +
                "Half a cup dessicated coconut\n" +
                "Half a cup white sugar\n";

        name6= "Cardamom Flavoured Rice Pudding";
        desc6 = "Step1\n" +
                "Pour the milk into a pot and bring to a soft simmer on medium heat\n" +
                "Step2\n" +
                "Whilst the milk is heating, put the pods of cardamom seeds into a plastic bag and beat them with a rolling pin till the black seeds from inside the pod are released, as shown in the picture. Discard the skins" +
                "Step3\n" +
                "Once the milk is simmering, add in the rest of the ingredients. Allow it to simmer, uncovered for 1.5 hours, or until your desired consistency is reached" +
                "Step4\n" +
                "You will need to stir the kheer often and scrape the bottom of the pot to prevent it from sticking. If a filmy layer (malai) forms on top, simply mix it in. Don't worry if the stirring breaks some of the rice - this will give the kheer a good texture." +
                "Step5\n" +
                "When the kheer is done, garnish with nuts and/or dried fruit. Enjoy!";
        drawable6 = getResources().getDrawable(R.mipmap.pudding_round,getTheme());

        in6 =   " full-fat milk\n" +
                " basmati rice\n" +
                "cardamom seeds (elaichi)\n" +
                " sugar";

        qn6 =  "5 cups full-fat milk\n" +
                "1/2 cup basmati rice\n" +
                "5 pods cardamom seeds (elaichi)\n" +
                "1/2 cup sugar";

        name7= "Potato Fry ";
        desc7 = "Step1\n" +
                "Heat vegetable oil in a pan on a medium to high heat.\n" +
                "Step2\n" +
                "Add the mustard seeds and cumin seeds and let them sizzle.\n" +
                "Step3\n" +
                "Add the sliced potatoes and stir fry so they become slightly golden and are incorporated with the mustard and cumin seeds.\n" +
                "Step4\n" +
                "Stir in green chilli, ginger/garlic paste, coriander powder, red chillies, turmeric and salt with the potatoes.\n" +
                "Step5\n" +
                "Add two tablespoons of water and cover to let steam build up and cook the potatoes.\n" +
                "Step6\n" +
                "Optionally, cook after all the water has evaporated to crisp them up.\n" +
                "Step7\n" +
                "Serve with naan or chapatis..";
        drawable7 = getResources().getDrawable(R.mipmap.patato_round,getTheme());

        in7 =   " potatoes, halved and thinly sliced\n" +
                " vegetable oil\n" +
                "cumin seeds\n" +
                " mustard seeds\n" +
                "ginger/garlic paste\n" +
                "green chilli\n" +
                " coriander powder\n" +
                " red chilli powder\n" +
                " turmeric\n" +
                "Salt";

        qn7 =  "8 large potatoes\n" +
                "1 tsp vegetable oil\n" +
                "1½ tsp cumin seeds\n" +
                "1½ tsp mustard seeds\n" +
                "2 tsp ginger/garlic paste\n" +
                "1 tsp green chilli\n" +
                "2 tsp coriander powder\n" +
                "1 tsp red chilli powder\n" +
                "1 tsp turmeric\n" +
                "Salt, to taste";

        name8= "Sweet and Sour Chicken";
        desc8 = "Step 1\n" +
                "In a saucepan, combine 1 1/2 cups water, sugar, vinegar, reserved pineapple juice, and orange food coloring. Heat to boiling. Turn off heat. Combine 1/4 cup cornstarch and 1/4 cup water; slowly stir into saucepan. Continue stirring until mixture thickens.\n" +
                "\n" +
                "Step 2\n" +
                "Combine flour, 2 tablespoons oil, 2 tablespoons cornstarch, salt, white pepper, and egg. Add 1 1/2 cups water gradually to make a thick batter. Stir to blend thoroughly. Add chicken pieces, and stir until chicken is well coated.\n" +
                "\n" +
                "Step 3\n" +
                "Heat oil in skillet or wok to 360 degrees F (180 degrees C). Fry chicken pieces in hot oil 10 minutes, or until golden. Remove chicken, and drain on paper towels.\n" +
                "\n" +
                "Step 4\n" +
                "When ready to serve, layer green peppers, pineapple chunks, and cooked chicken pieces on a platter. Pour hot sweet and sour sauce over top.";
        drawable8 = getResources().getDrawable(R.mipmap.sweet_round,getTheme());

        in8 =   " can pineapple chunks, drained (juice reserved)\n" +
                " cornstarch\n" +
                "cups water, divided\n" +
                "white sugar\n" +
                "distilled white vinegar\n" +
                " orange food color\n" +
                " skinless, boneless chicken breast halves - cut into 1 inch cubes\n" +
                " self-rising flour\n" +
                " vegetable oil\n" +
                "cornstarch\n" +
                " salt\n" +
                " ground white pepper\n" +
                "egg\n" +
                "water\n" +
                " vegetable oil for frying\n" +
                "green bell pepper, cut into 1 inch pieces";

        qn8 =  " (8 ounce) can pineapple chunks\n" +
                "¼ cup cornstarch\n" +
                "1 ¾ cups water\n" +
                "¾ cup white sugar\n" +
                "½ cup distilled white vinegar\n" +
                "2 drops orange food color\n" +
                "8 skinless\n" +
                "2 ¼ cups self-rising flour\n" +
                "2 tablespoons vegetable oil\n" +
                "2 tablespoons cornstarch\n" +
                "½ teaspoon salt\n" +
                "¼ teaspoon ground white pepper\n" +
                "1 egg\n" +
                "1 ½ cups water\n" +
                "1 quart vegetable oil\n" +
                "2 green bell pepper";

        name9= "Addictive Sesame Chicken";
        desc9 = "Step 1\n" +
                "Combine the 2 tablespoons soy sauce, the dry sherry, dash of sesame oil, flour, 2 tablespoons cornstarch, 2 tablespoons water, baking powder, baking soda, and canola oil in a large bowl. Mix well; stir in the chicken. Cover and refrigerate for 20 minutes.\n" +
                "\n" +
                "Step 2\n" +
                "Heat oil in a deep-fryer or large saucepan to 375 degrees F (190 degrees C).\n" +
                "\n" +
                "Step 3\n" +
                "Combine the 1/2 cup water, chicken broth, vinegar, 1/4 cup cornstarch, sugar, 2 tablespoons soy sauce, 2 tablespoons sesame oil, red chili paste, and garlic in a small saucepan. Bring to a boil, stirring constantly. Turn heat to low and keep warm, stirring occasionally.\n" +
                "\n" +
                "Step 4\n" +
                "Fry the marinated chicken in batches until cooked through and golden brown, 3 to 5 minutes. Drain on paper towels.\n" +
                "\n" +
                "Step 5\n" +
                "Transfer the chicken to a large platter, top with sauce, and sprinkle with sesame seeds.";
        drawable9 = getResources().getDrawable(R.mipmap.sesame_round,getTheme());

        in9 =   " soy sauce\n" +
                " dry sherry\n" +
                " sesame oil\n" +
                "all-purpose flour\n" +
                " cornstarch\n" +
                " water\n" +
                " baking powder\n" +
                " baking soda\n" +
                " canola oil\n" +
                " skinless, boneless chicken breast halves, cut into 1-inch cubes\n" +
                " vegetable oil for frying\n" +
                " water\n" +
                " chicken broth\n" +
                " distilled white vinegar\n" +
                " cornstarch\n" +
                " white sugar\n" +
                " soy sauce\n" +
                "sesame oil\n" +
                " red chile paste (such as Thai Kitchen®)\n" +
                " garlic, minced\n" +
                " toasted sesame seeds";
        qn9 =  "2 tablespoons soy sauce\n" +
                "1 tablespoon dry sherry\n" +
                "1 dash sesame oil\n" +
                "2 tablespoons all-purpose flour\n" +
                "2 tablespoons cornstarch\n" +
                "2 tablespoons water\n" +
                "¼ teaspoon baking powder\n" +
                "¼ teaspoon baking soda\n" +
                "1 teaspoon canola oil\n" +
                "4 (5 ounce) skinless\n" +
                "1 quart vegetable oil for frying\n" +
                "½ cup water\n" +
                "1 cup chicken broth\n" +
                "¼ cup distilled white vinegar\n" +
                "¼ cup cornstarch\n" +
                "1 cup white sugar\n" +
                "2 tablespoons soy sauce\n" +
                "2 tablespoons sesame oil\n" +
                "1 teaspoon red chile paste \n" +
                "1 clove garlic\n" +
                "2 tablespoons toasted sesame seeds";

        name10= "Chinese Green Bean Stir-Fry";
        desc10 = "Step 1\n" +
                "In a large wok, heat oil over medium-high heat. Stir in green beans; cook, stirring frequently, for 1 to 2 minutes. Stir in garlic and ginger; cook, stirring frequently, for 3 to 4 minutes. Season with salt and pepper, and then stir in black bean sauce. Continue cooking until green beans are tender.";
        drawable10 = getResources().getDrawable(R.mipmap.beens_round,getTheme());

        in10=   " vegetable oil\n" +
                " fresh green beans, trimmed\n" +
                " minced garlic\n" +
                " minced fresh ginger root\n" +
                " kosher salt\n" +
                "coarsely ground black pepper\n" +
                " bottles black bean sauce";

        qn10 =  "1 cup vegetable oil\n" +
                "13 pounds fresh green beans\n" +
                "5 tablespoons minced garlic\n" +
                "5 tablespoons minced fresh ginger root\n" +
                "2 tablespoons kosher salt\n" +
                "1 tablespoon coarsely ground black pepper\n" +
                "2 (8 ounce) bottles black bean sauce";

        name11= "Pork Dumplings";
        desc11 = "Step 1\n" +
                "In a large bowl, combine the pork, ginger, garlic, green onion, soy sauce, sesame oil, egg and cabbage. Stir until well mixed.\n" +
                "\n" +
                "Step 2\n" +
                "Place 1 heaping teaspoon of pork filling onto each wonton skin. Moisten edges with water and fold edges over to form a triangle shape. Roll edges slightly to seal in filling. Set dumplings aside on a lightly floured surface until ready to cook.\n" +
                "\n" +
                "Step 3\n" +
                "To Cook: Steam dumplings in a covered bamboo or metal steamer for about 15 to 20 minutes. Serve immediately.";
        drawable11 = getResources().getDrawable(R.mipmap.dumplings_round,getTheme());
        in11 =   " wonton wrappers\n" +
                " ground pork\n" +
                " minced fresh ginger root\n" +
                " garlic, minced\n" +
                "thinly sliced green onion\n" +
                "soy sauce\n" +
                "sesame oil\n" +
                "egg, beaten\n" +
                "finely shredded Chinese cabbage";
        qn11 =  "100 (3.5 inch square) wonton wrappers\n" +
                "1 ¾ pounds ground pork\n" +
                "1 tablespoon minced fresh ginger root\n" +
                "4 cloves garlic\n" +
                "2 tablespoons thinly sliced green onion\n" +
                "4 tablespoons soy sauce\n" +
                "3 tablespoons sesame oil\n" +
                "1 egg\n" +
                "5 cups finely shredded Chinese cabbage";

        name12= "Beef Roast";
        desc12 ="Step1\n" +
                " let roast sit uncovered at room temperature for 1 to 2 hours.\n" +
                "Step2\n" +
                "Preheat oven to 450°. In a small bowl, combine oil, garlic, rosemary, thyme, salt, and pepper. Rub all over roast.\n" +
                "Step3\n" +
                "Place roast in roasting pan fitted with a roasting rack. Roast for 15 minutes, then reduce heat to 325° and roast 1 hours 45 minutes more for medium, or 2 hours for medium well done.\n" +
                "Step4\n" +
                "Remove from oven and let rest 15 to 30 minutes before serving.";
        drawable12 = getResources().getDrawable(R.mipmap.beef_roast_round,getTheme());
        in12 =   " round roast\n" +
                "extra-virgin olive oil\n" +
                " garlic, minced\n" +
                "  fresh rosemary \n" +
                "  fresh thyme leaves\n" +
                " kosher salt\n" +
                " freshly ground black pepper";
        qn12 =  "1 (4-lb.) round roast\n" +
                "1/4 c. extra-virgin olive oil\n" +
                "3 cloves garlic\n" +
                "1 tbsp. chopped fresh rosemary \n" +
                "1 tbsp. chopped fresh thyme leaves\n" +
                "2 tsp. kosher salt\n" +
                "1 tsp. freshly ground black pepper";

        name13= "Lamb Roast";
        desc13 ="Step1\n" +
                "Take lamb out of fridge at least 1 hour before roasting. (Note 2)\n" +
                "Step2\n" +
                "Rub: Combine rosemary, garlic and olive oil. Mix and set aside for 20 minutes+.\n" +
                "Step3\n" +
                "Preheat oven to 220C/430F (fan forced / convection) (Note 3) with oven shelf in the middle.\n" +
                "Step4\n" +
                "Place garlic cut side up in a roasting pan. Toss in rosemary sprigs.\n" +
                "Step5\n" +
                "Turn the lamb over so the underside is facing up. Pour half the Rub on, add a good sprinkle of salt and pepper. Rub all over.\n" +
                "Step6\n" +
                "Transfer into roasting pan, placing it on the garlic to elevate the lamb. Rub remaining rub + salt and pepper over lamb.\n" +
                "Step7\n" +
                "Roast lamb for 20 minutes then turn down to 180C/350F (fan forced/convection) (Note 4). Roast for 1 hour - total of 1 hr 20 minutes.\n" +
                "Step8\n" +
                "Remove lamb from oven. The internal temperature should be 55 - 60C/131 - 140F for medium rare (pictured). This will rise to 61 - 65C / 142 - 151F after resting. See notes for cook times - Note 5.\n" +
                "Step9\n" +
                "Transfer lamb to plate, cover with foil and rest for 20 - 30 minutes.\n" +
                "Step10\n" +
                "Make gravy straight away while roasting pan is hot.";
        drawable13 = getResources().getDrawable(R.mipmap.lamb_roast_round,getTheme());
        in13 =   " lamb leg, bone in\n" +
                "RUB\n" +
                "fresh rosemary leaves, finely chopped*\n" +
                " garlic cloves, minced*\n" +
                "olive oil\n" +
                "Salt and pepper\n" +
                "BASE\n" +
                " whole heads of garlic, halved horizontally (Note 1)\n" +
                "Few sprigs rosemary *\n" +
                "GRAVY\n" +
                " flour\n" +
                "beef broth / stock ";
        qn13 =  "2.25 kg / 4.5lb lamb leg, bone in\n" +
                "1 1/2 tbsp fresh rosemary leaves, finely chopped*\n" +
                "3 garlic cloves, minced*\n" +
                "2 tbsp olive oil\n" +
                "Salt and pepper\n" +
                "2 whole heads of garlic\n" +
                "4 tbsp / 50g flour\n" +
                "2 1/2 cups / 625 ml beef broth / stock (Note 2)";

        name14= "Chicken Roast";
        desc14 ="Step1\n" +
                "Preheat oven to 450˚F.\n" +
                "Step2\n" +
                "Remove giblets from inside of the chicken's cavity.\n" +
                "Step3\n" +
                "Thoroughly dry the chicken with paper towels.\n" +
                "Step4\n" +
                "Place chicken, breast side UP, on a rack set over a shallow roasting pan or jelly roll pan.\n" +
                "Step5\n" +
                "Brush chicken with melted butter.\n" +
                "Step6\n" +
                "Sprinkle or rub minced garlic all over chicken.\n" +
                "Step7\n" +
                "In a small bowl combine salt, basil, thyme, and lemon pepper; rub onto the chicken.\n" +
                "Step8\n" +
                "Add some salt to the inside of the cavity and fill the cavity with lemon slices, rosemary, and garlic cloves.\n" +
                "Step9\n" +
                "Tie the legs together with kitchen twine, and tuck the wings under the body of the chicken.\n" +
                "Step10\n" +
                "Roast, uncovered, for 10 minutes.\n" +
                "Step11\n" +
                "Reduce oven temperature to 350˚F and continue to cook until done; about 1 more hour and 10 minutes, or until internal temperature of chicken reaches 165˚F.\n" +
                "Step12\n" +
                "Remove from oven and baste the chicken with the juices.\n" +
                "Step13\n" +
                "Let rest for about 15 to 20 minutes before cutting.";
        drawable14 = getResources().getDrawable(R.mipmap.chicken_roast_round,getTheme());
        in14 =   " whole broiler-fryer chicken\n" +
                "butter, melted\n" +
                "cloves garlic, minced\n" +
                "salt, or to taste\n" +
                " dried basil\n" +
                " dried thyme\n" +
                "lemon pepper seasoning, or you can also use fresh ground black pepper\n" +
                "lemon, quartered\n" +
                "fresh rosemary sprigs\n" +
                "garlic, peeled ";
        qn14 =  "3 to 3-1/2 pound whole broiler-fryer chicken\n" +
                "3 tablespoons butter\n" +
                "3 cloves garlic\n" +
                "3/4 teaspoon salt\n" +
                "1 teaspoon dried basil\n" +
                "1/2 teaspoon dried thyme\n" +
                "1/4 teaspoon lemon pepper seasoning\n" +
                "1 lemon\n" +
                "3 fresh rosemary sprigs\n" +
                "4 cloves garlic";

        name15= "Steam Chicken Roast";
        desc15 ="Step1\n" +
                "Process chilis, garlic and ginger into a fine paste.\n" +
                "Step2\n" +
                "Add all the spices.\n" +
                "Step3\n" +
                "Combine together to make a dry spice rub.\n" +
                "Step4\n" +
                "Cut slits into the chicken meat and thoroughly massage with the spice blend.\n" +
                "Step5\n" +
                "Sprinkle lemon juice on top. Cover!\n" +
                "Step6\n" +
                "Marinate overnight in the refrigerator.\n" +
                "Step7\n" +
                "Take 1 cup water in the pressure cooker or Instapot Add vinegar.\n" +
                "Step8\n" +
                "Place a wire rack inside the cooking vessel.\n" +
                "Step9\n" +
                "Carefully place the marinated chicken on the rack Close the lid and set the valve to \"sealed\".\n" +
                "Step10\n" +
                "Set the timer and allow to cook. See notes!\n" +
                "Step11\n" +
                "Release excess pressure carefully. Transfer the chicken to a baking dish.Apply clarified butter and broil in oven on highest temperature for 5 min.\n" +
                "Step12\n" +
                "Serve with mint-yoghurt or plum chutney.";
        drawable15 = getResources().getDrawable(R.mipmap.steam_round,getTheme());
        in15 =   "whole skinned chicken\n" +
                "green chilis\n" +
                " garlic\n" +
                " ginger\n" +
                " red chili powder\n" +
                " roasted cumin powder\n" +
                " cumin seeds\n" +
                " coriander powder\n" +
                " chili flakes\n" +
                " black pepper powder\n" +
                "dried fenugreek kasuri methi\n" +
                " orange food color zarda rang\n" +
                " tikka masala\n" +
                " salt\n" +
                "lemon juice\n" +
                "water\n" +
                " vinegar white or black\n" +
                " clarified butter desi ghee ";
        qn15 =  "1,5 kg whole skinned chicken\n" +
                "3 green chilis\n" +
                "3-4 cloves garlic\n" +
                "1 Tbsp ginger\n" +
                "2 tsp red chili powder\n" +
                "2 tsp roasted cumin powder\n" +
                "1 tsp cumin seeds\n" +
                "2 tsp coriander powder\n" +
                "1/2 tsp chili flakes\n" +
                "1 tsp black pepper powder\n" +
                "2 Tbsp dried fenugreek kasuri methi\n" +
                "1/2 tsp orange food color zarda rang\n" +
                "2 tsp tikka masala\n" +
                "1 Tbsp salt\n" +
                "2 Tbsp lemon juice\n" +
                "1 cup water\n" +
                "2 Tbsp vinegar white or black\n" +
                "3 Tbsp clarified butter desi ghee";


//    }
//    public void onStart(){
//        super.onStart();

        imageBitmap = drawableToBitmap(drawable);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        imageBitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
        img = stream.toByteArray();

        FoodsDB db = new FoodsDB(this);
        Foods f = new Foods(img, name, "Italian", in, qn, desc);
        db.insert(f);

        imageBitmap1 = drawableToBitmap(drawable1);
        ByteArrayOutputStream stream1 = new ByteArrayOutputStream();
        imageBitmap1.compress(Bitmap.CompressFormat.PNG, 100, stream1);
        img1 = stream1.toByteArray();
        Foods f1 = new Foods(img1, name1, "Italian", in1, qn1, desc1);
        db.insert(f1);

        imageBitmap2 = drawableToBitmap(drawable2);
        ByteArrayOutputStream stream2 = new ByteArrayOutputStream();
        imageBitmap2.compress(Bitmap.CompressFormat.PNG, 100, stream2);
        img2 = stream2.toByteArray();
        Foods f2 = new Foods(img2, name2, "Italian", in2, qn2, desc2);
        db.insert(f2);

        imageBitmap3 = drawableToBitmap(drawable3);
        ByteArrayOutputStream stream3 = new ByteArrayOutputStream();
        imageBitmap3.compress(Bitmap.CompressFormat.PNG, 100, stream3);
        img3 = stream3.toByteArray();
        Foods f3 = new Foods(img3, name3, "Italian", in3, qn3, desc3);
        db.insert(f3);

        imageBitmap4 = drawableToBitmap(drawable4);
        ByteArrayOutputStream stream4 = new ByteArrayOutputStream();
        imageBitmap4.compress(Bitmap.CompressFormat.PNG, 100, stream4);
        img4 = stream4.toByteArray();
        Foods f4 = new Foods(img4, name4, "Desi", in4, qn4, desc4);
        db.insert(f4);

        imageBitmap5 = drawableToBitmap(drawable5);
        ByteArrayOutputStream stream5 = new ByteArrayOutputStream();
        imageBitmap5.compress(Bitmap.CompressFormat.PNG, 100, stream5);
        img5 = stream5.toByteArray();
        Foods f5 = new Foods(img5, name5, "Desi", in5, qn5, desc5);
        db.insert(f5);

        imageBitmap6 = drawableToBitmap(drawable6);
        ByteArrayOutputStream stream6 = new ByteArrayOutputStream();
        imageBitmap6.compress(Bitmap.CompressFormat.PNG, 100, stream6);
        img6 = stream6.toByteArray();
        Foods f6 = new Foods(img6, name6, "Desi", in6, qn6, desc6);
        db.insert(f6);

        imageBitmap7 = drawableToBitmap(drawable7);
        ByteArrayOutputStream stream7 = new ByteArrayOutputStream();
        imageBitmap7.compress(Bitmap.CompressFormat.PNG, 100, stream7);
        img7 = stream7.toByteArray();
        Foods f7 = new Foods(img7, name7, "Desi", in7, qn7, desc7);
        db.insert(f7);

        imageBitmap8 = drawableToBitmap(drawable8);
        ByteArrayOutputStream stream8 = new ByteArrayOutputStream();
        imageBitmap8.compress(Bitmap.CompressFormat.PNG, 100, stream8);
        img8 = stream8.toByteArray();
        Foods f8 = new Foods(img8, name8, "Chinese", in8, qn8, desc8);
        db.insert(f8);

        imageBitmap9 = drawableToBitmap(drawable9);
        ByteArrayOutputStream stream9 = new ByteArrayOutputStream();
        imageBitmap9.compress(Bitmap.CompressFormat.PNG, 100, stream9);
        img9 = stream9.toByteArray();
        Foods f9 = new Foods(img9, name9, "Chinese", in9, qn9, desc9);
        db.insert(f9);

        imageBitmap10 = drawableToBitmap(drawable10);
        ByteArrayOutputStream stream10 = new ByteArrayOutputStream();
        imageBitmap10.compress(Bitmap.CompressFormat.PNG, 100, stream10);
        img10 = stream10.toByteArray();
        Foods f10 = new Foods(img10, name10, "Chinese", in10, qn10, desc10);
        db.insert(f10);

        imageBitmap11 = drawableToBitmap(drawable11);
        ByteArrayOutputStream stream11 = new ByteArrayOutputStream();
        imageBitmap11.compress(Bitmap.CompressFormat.PNG, 100, stream11);
        img11 = stream11.toByteArray();
        Foods f11 = new Foods(img11, name11, "Chinese", in11, qn11, desc11);
        db.insert(f11);

        imageBitmap12 = drawableToBitmap(drawable12);
        ByteArrayOutputStream stream12 = new ByteArrayOutputStream();
        imageBitmap12.compress(Bitmap.CompressFormat.PNG, 100, stream12);
        img12 = stream12.toByteArray();
        Foods f12 = new Foods(img12, name12, "Roast", in12, qn12, desc12);
        db.insert(f12);

        imageBitmap13 = drawableToBitmap(drawable13);
        ByteArrayOutputStream stream13 = new ByteArrayOutputStream();
        imageBitmap13.compress(Bitmap.CompressFormat.PNG, 100, stream13);
        img13 = stream13.toByteArray();
        Foods f13 = new Foods(img13, name13, "Roast", in13, qn13, desc13);
        db.insert(f13);

        imageBitmap14 = drawableToBitmap(drawable14);
        ByteArrayOutputStream stream14 = new ByteArrayOutputStream();
        imageBitmap14.compress(Bitmap.CompressFormat.PNG, 100, stream14);
        img14 = stream14.toByteArray();
        Foods f14 = new Foods(img14, name14, "Roast", in14, qn14, desc14);
        db.insert(f14);

        imageBitmap15 = drawableToBitmap(drawable15);
        ByteArrayOutputStream stream15 = new ByteArrayOutputStream();
        imageBitmap15.compress(Bitmap.CompressFormat.PNG, 100, stream15);
        img15 = stream15.toByteArray();
        Foods f15 = new Foods(img15, name15, "Roast", in15, qn15, desc15);
        db.insert(f15);

    }


        public static Bitmap drawableToBitmap(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }

        final int width = !drawable.getBounds().isEmpty() ? drawable
                .getBounds().width() : drawable.getIntrinsicWidth();

        final int height = !drawable.getBounds().isEmpty() ? drawable
                .getBounds().height() : drawable.getIntrinsicHeight();

        final Bitmap bitmap = Bitmap.createBitmap(width <= 0 ? 1 : width,
                height <= 0 ? 1 : height, Bitmap.Config.ARGB_8888);

        Log.v("Bitmap width - Height :", width + " : " + height);
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);

        return bitmap;
    }

    public void italian(View view) {
        try {

            String key = "Italian";
            Intent i = new Intent(this , menu.class);
            i.putExtra("key", key);
            startActivity(i);


                imageBitmap = drawableToBitmap(drawable);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                imageBitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
                img = stream.toByteArray();

                FoodsDB db = new FoodsDB(this);
                Foods f = new Foods(img, name, "Italian", in, qn, desc);
                db.insert(f);

            imageBitmap1 = drawableToBitmap(drawable1);
            ByteArrayOutputStream stream1 = new ByteArrayOutputStream();
            imageBitmap1.compress(Bitmap.CompressFormat.PNG, 100, stream1);
            img1 = stream1.toByteArray();
            Foods f1 = new Foods(img1, name1, "Italian", in1, qn1, desc1);
            db.insert(f1);

            imageBitmap2 = drawableToBitmap(drawable2);
            ByteArrayOutputStream stream2 = new ByteArrayOutputStream();
            imageBitmap2.compress(Bitmap.CompressFormat.PNG, 100, stream2);
            img2 = stream2.toByteArray();
            Foods f2 = new Foods(img2, name2, "Italian", in2, qn2, desc2);
            db.insert(f2);

            imageBitmap3 = drawableToBitmap(drawable3);
            ByteArrayOutputStream stream3 = new ByteArrayOutputStream();
            imageBitmap3.compress(Bitmap.CompressFormat.PNG, 100, stream3);
            img3 = stream3.toByteArray();
            Foods f3 = new Foods(img3, name3, "Italian", in3, qn3, desc3);
            db.insert(f3);

            imageBitmap4 = drawableToBitmap(drawable4);
            ByteArrayOutputStream stream4 = new ByteArrayOutputStream();
            imageBitmap4.compress(Bitmap.CompressFormat.PNG, 100, stream4);
            img4 = stream4.toByteArray();
            Foods f4 = new Foods(img4, name4, "Desi", in4, qn4, desc4);
            db.insert(f4);

            imageBitmap5 = drawableToBitmap(drawable5);
            ByteArrayOutputStream stream5 = new ByteArrayOutputStream();
            imageBitmap5.compress(Bitmap.CompressFormat.PNG, 100, stream5);
            img5 = stream5.toByteArray();
            Foods f5 = new Foods(img5, name5, "Desi", in5, qn5, desc5);
            db.insert(f5);

            imageBitmap6 = drawableToBitmap(drawable6);
            ByteArrayOutputStream stream6 = new ByteArrayOutputStream();
            imageBitmap6.compress(Bitmap.CompressFormat.PNG, 100, stream6);
            img6 = stream6.toByteArray();
            Foods f6 = new Foods(img6, name6, "Desi", in6, qn6, desc6);
            db.insert(f6);

            imageBitmap7 = drawableToBitmap(drawable7);
            ByteArrayOutputStream stream7 = new ByteArrayOutputStream();
            imageBitmap7.compress(Bitmap.CompressFormat.PNG, 100, stream7);
            img7 = stream7.toByteArray();
            Foods f7 = new Foods(img7, name7, "Desi", in7, qn7, desc7);
            db.insert(f7);

            imageBitmap8 = drawableToBitmap(drawable8);
            ByteArrayOutputStream stream8 = new ByteArrayOutputStream();
            imageBitmap8.compress(Bitmap.CompressFormat.PNG, 100, stream8);
            img8 = stream8.toByteArray();
            Foods f8 = new Foods(img8, name8, "Chinese", in8, qn8, desc8);
            db.insert(f8);

            imageBitmap9 = drawableToBitmap(drawable9);
            ByteArrayOutputStream stream9 = new ByteArrayOutputStream();
            imageBitmap9.compress(Bitmap.CompressFormat.PNG, 100, stream9);
            img9 = stream9.toByteArray();
            Foods f9 = new Foods(img9, name9, "Chinese", in9, qn9, desc9);
            db.insert(f9);

            imageBitmap10 = drawableToBitmap(drawable10);
            ByteArrayOutputStream stream10 = new ByteArrayOutputStream();
            imageBitmap10.compress(Bitmap.CompressFormat.PNG, 100, stream10);
            img10 = stream10.toByteArray();
            Foods f10 = new Foods(img10, name10, "Chinese", in10, qn10, desc10);
            db.insert(f10);

            imageBitmap11 = drawableToBitmap(drawable11);
            ByteArrayOutputStream stream11 = new ByteArrayOutputStream();
            imageBitmap11.compress(Bitmap.CompressFormat.PNG, 100, stream11);
            img11 = stream11.toByteArray();
            Foods f11 = new Foods(img11, name11, "Chinese", in11, qn11, desc11);
            db.insert(f11);

            imageBitmap12 = drawableToBitmap(drawable12);
            ByteArrayOutputStream stream12 = new ByteArrayOutputStream();
            imageBitmap12.compress(Bitmap.CompressFormat.PNG, 100, stream12);
            img12 = stream12.toByteArray();
            Foods f12 = new Foods(img12, name12, "Roast", in12, qn12, desc12);
            db.insert(f12);

            imageBitmap13 = drawableToBitmap(drawable13);
            ByteArrayOutputStream stream13 = new ByteArrayOutputStream();
            imageBitmap13.compress(Bitmap.CompressFormat.PNG, 100, stream13);
            img13 = stream13.toByteArray();
            Foods f13 = new Foods(img13, name13, "Roast", in13, qn13, desc13);
            db.insert(f13);

            imageBitmap14 = drawableToBitmap(drawable14);
            ByteArrayOutputStream stream14 = new ByteArrayOutputStream();
            imageBitmap14.compress(Bitmap.CompressFormat.PNG, 100, stream14);
            img14 = stream14.toByteArray();
            Foods f14 = new Foods(img14, name14, "Roast", in14, qn14, desc14);
            db.insert(f14);

            imageBitmap15 = drawableToBitmap(drawable15);
            ByteArrayOutputStream stream15 = new ByteArrayOutputStream();
            imageBitmap15.compress(Bitmap.CompressFormat.PNG, 100, stream15);
            img15 = stream15.toByteArray();
            Foods f15 = new Foods(img15, name15, "Roast", in15, qn15, desc15);
            db.insert(f15);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void desi(View view) {

        try {

            String key = "Desi";
            Intent i = new Intent(this , menu.class);
            i.putExtra("key", key);
            startActivity(i);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void chinese(View view) {
        try {

            String key = "Chinese";
            Intent i = new Intent(this , menu.class);
            i.putExtra("key", key);
            startActivity(i);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public void roast(View view) {

    try {
        String key = "Roast";
        Intent i = new Intent(this, menu.class);
        i.putExtra("key", key);
        startActivity(i);
    }
    catch (Exception e){
        e.printStackTrace();
    }

    }

    public void get(View view) {

        String key = "Custom";
        Intent i = new Intent(this , menu.class);
        i.putExtra("key", key);
        startActivity(i);
    }

    public void add(View view) {

        Intent intent = new Intent(this, insert.class);

        startActivity(intent);
    }


    public void youtube(View view) {

        Intent intent=null;
        String url = "https://www.youtube.com/channel/UCT5IRHpnPwgUxWCe6_DHjYA";
        try {
            intent =new Intent(Intent.ACTION_VIEW);
            intent.setPackage("com.google.android.youtube");
            intent.setData(Uri.parse(url));
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }
    }

}