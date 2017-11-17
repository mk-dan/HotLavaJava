package genesis.random;

class FilmReview{
    
    public static void main(String[] arguments){
        
        String film = "Justice League";
        int lenght = 120;
        String rating = "12A";
        String date = "Friday November 2017";
        
        System.out.println(film.toUpperCase());
        System.out.println("Rated: " + rating);
        System.out.println("Running time: " + lenght + " minutes");
        System.out.println("UK release date: " + date);
        System.out.println("\n\'Justice League\' feels like a sheepish feature-length retraction of"
                + "\nthe franchise to date. It’s consistently embarrassing to watch, and"
                + "\nfeatures plot holes so yawningly vast they have a kind of Grand"
                + "\nCanyon-like splendour: part of you wants to hang around to see"
                + "\nwhat they look like at sunset.\n"
                + "\n\t-- Robbie Collin - The Telegraph - 1/5");
        
        System.out.println("\n“I am working with children,” Wonder Woman (Gal Gadot) sighs"
                + "\nin mock exasperation toward the end of Zack Snyder’s Justice "
                + "\nLeague. She has a point. This is surely the most infantile of"
                + "\nrecent superhero yarns - a film that squanders the talents of an "
                + "\nimpressive ensemble cast and eschews any meaningful characterisation"
                + "\nin favour of ever more overblown special effects.\n"
                + "\n\t-- Geoffrey Macnab - The Independent - 2/5\n");
        
        String thoughts = "I can't wait to watch Justice League in Cinema";
        String reaction = "I will now not watch justice League in Cinema";
        
        System.out.println("What are your thoughts about the film based on the reviews you just read, will"
                + "\nyou watch Justice League in the cinema?\n");
        
        System.out.println("Answer: " + thoughts.equalsIgnoreCase(reaction) + "\n");
        
    }
}