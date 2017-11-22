package genesis.random;

class FilmReview{
    
    public static void main(String[] arguments){
        
        // set variable to hold film details
        String film = "Justice League";
        int lenght = 120;
        String rating = "12A";
        String date = "Friday November 2017";
        
        // display film details
        System.out.println(film.toUpperCase());
        System.out.println("Rated: " + rating);
        System.out.println("Running time: " + lenght + " minutes");
        System.out.println("UK release date: " + date);
        
        // display the first film review
        System.out.println("\n\'Justice League\' feels like a sheepish feature-length retraction of"
                + "\nthe franchise to date. It’s consistently embarrassing to watch, and"
                + "\nfeatures plot holes so yawningly vast they have a kind of Grand"
                + "\nCanyon-like splendour: part of you wants to hang around to see"
                + "\nwhat they look like at sunset.\n"
                + "\n\t-- Robbie Collin - The Telegraph - 1/5");
        
        // display the second film review
        System.out.println("\n“I am working with children,” Wonder Woman (Gal Gadot) sighs"
                + "\nin mock exasperation toward the end of Zack Snyder’s Justice "
                + "\nLeague. She has a point. This is surely the most infantile of"
                + "\nrecent superhero yarns - a film that squanders the talents of an "
                + "\nimpressive ensemble cast and eschews any meaningful characterisation"
                + "\nin favour of ever more overblown special effects.\n"
                + "\n\t-- Geoffrey Macnab - The Independent - 2/5\n");
        
        // set variable to hold a filmgoers thoughts and reaction after reading the review
        String thoughts = "I can't wait to watch Justice League in Cinema";
        String reaction = "I will now not watch justice League in Cinema";
        
        // display question
        System.out.println("What are your thoughts about the film based on the reviews you just read, will"
                + "\nyou watch Justice League in the cinema?\n");
        
        // display answer using method to determine if two strings have the same value
        System.out.println("Answer: " + thoughts.equalsIgnoreCase(reaction) + "\n");
        
    }
}