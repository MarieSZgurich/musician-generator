public class generator{

    //Data
    //Going to make an API for this mess later
    static String[] adjective = {"Aged", "Accidental", "Ancient", "Actual", "Aquatic", "Alluring", "Ambiguous", 
    "Beefy", "Basic", "Bite-Sized", "Bustling", "Boiling", "Billowy", "Crispy", "Classy",
    "Cruel", "Customizable", "Cumbersome", "Clammy", "Crazy", "Cowardly", "Disturbed", "Delicious",
    "Debonair", "Dysfunctional", "Elastic", "Effervescent", "Existing", "Electric", "Fuzzy", "Foamy",
    "Federal", "Futuristc", "Fallacious", "Fragrant", "Furry", "Grotesque", "Gaping", "Gorgeous",
    "Husky", "Hungry", "Honorable", "High", "Icky", "Infamous", "Imaginary", "Juvenile", "Juicy",
    "Jazzy", "Kindly", "Lonely", "Little", "Massive", "Malicious", "Maniacal", "Mighty", "Mean", "Male",
    "Milky", "Messy", "Mountainous", "Macho", "Mundane", "Nebulous", "Nifty", "Nondescript",
    "Noxious", "Nervous", "Outstanding", "Old-Fashioned", "Organic", "Political", "Painful", 
    "Quaint", "Quirky", "Questionable", "Royal", "Rustic", "Sticky", "Saucy", "Succulent", 
    "Small", "Soggy", "Sweet", "Slippery", "Thick", "Terrible", "Tender", "Undesirable", "Vulgar",
    "Venomous", "Valuable", "Woozy", "Weak", "Wet", "Watery", "Yummy", "Zesty", "Zealous"};

    static String[] noun = {"Artisan", "Analyst", "Actor", "Almond", "Beef", "Boy", "Bathroom", "Bird",
    "Cookie", "Chocolate", "Country", "Consumer", "Debt", "Duck", "Danger", "Dinner", "Emotions", "Energy",
    "Establishment", "Farmer", "Funeral", "Family", "Girl", "Grandmother", "Hat", "Honey",
    "Insect", "Judge", "Juice", "King", "Love", "Loss", "Lady", "Man", "Mommy", "Meat", "Member", "Manager", "Mushroom",
    "Nuisance", "Nobody", "Orange", "Obligation", "Pacifier", "Peace", "Queen", "Quail",
    "Ratio", "Stranger", "Sauce", "Soul", "Thing", "Toilet", "Trout", "Tune",
    "Union", "Unit", "Virus", "Woman", "Walnut", "Yam", "Youth", "Zebra"};

    static String[] instrument = {"Agogo", "Bass Guitar", "Clarinet", "Maracas", "Cymbal", "Banjo",
    "Xylophone", "Recorder", "Cello", "Cowbell", "Guitar", "Electric Guitar", "Drums", "Harmonica",
    "Flute", "Mayonnaise", "Piano", "Keyboard", "Harp", "Accordion", "French Horn", "Trumpet",
    "Tuba", "Trombone", "Gong", "Mandolin", "Sitar"};

    static String[] genre = {"Jazz", "Blues", "Pop", "Rock", "Punk", "EDM", "Emo", "Classical", "Country",
    "Bluegrass", "R&B", "Soul", "Hip-Hop", "Swing", "Sea Shanty", "Indie", "Folk", "Metal", 
    "Death Metal", "Gospel"};

    //Methods

    //Generates which value to pick from an array
    public static int RNG(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args){
        int type = RNG(1, 7);


        if(type <= 4){
             
            System.out.printf("\nYour stage name is %s %s. You play the %s in a %s band.\n", adjective[RNG(0, adjective.length)], noun[RNG(0, noun.length)], instrument[RNG(0, instrument.length)], genre[RNG(0, genre.length)]);
        }

        else if(type == 5){

            System.out.printf("\nYour stage name is %s %s. You play the %s in a %s band.\n", noun[RNG(0, noun.length)], noun[RNG(0, noun.length)], instrument[RNG(0, instrument.length)], genre[RNG(0, genre.length)]);
        }

        else if(type == 6){

            System.out.printf("\nYour stage name is %s %s. You play the %s in a %s band.\n", instrument[RNG(0, instrument.length)], noun[RNG(0, noun.length)], instrument[RNG(0, instrument.length)], genre[RNG(0, genre.length)]);
        }

        else if(type == 7){

            System.out.printf("\nYour stage name is %s %s. You play the %s in a %s band.\n", adjective[RNG(0, adjective.length)], instrument[RNG(0, instrument.length)], instrument[RNG(0, instrument.length)], genre[RNG(0, genre.length)]);
        }

    }    

}