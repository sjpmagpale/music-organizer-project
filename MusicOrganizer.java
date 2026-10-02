import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 7.0
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)) {
            files.remove(index);
        }
    }
    
    public int checkIndex(int index)
    {
        if (index >= 0 && index < files.size()){
            return index;
        } else {
            System.out.println("ERROR");
            System.out.println("Index Range: 0 - " + files.size());
        }
        return index;
    }
    
    public boolean validIndex(int index)
    {
        if (index >= 0 && index < files.size()){
            return true; 
        } else {
            return false;
        }
    }
    
    public void listAllFiles()
    {
        for (String filename:files){
            System.out.println(filename);
        }
    }
    
    public void listWithIndex()
    {
        int position = 0 ;
        for (String filename:files){
            System.out.println(position + ": " + filename);
            position++;
        }
    }
    
    public void listMatching(String searchString)
    {
        int index = 0;
        boolean searching = true;
        
        while (searching && index < files.size()){
            String filename = files.get(index);
            if(filename.contains(searchString)){
                System.out.println(filename);
                searching = false;
            }else {
                index++;
            }
        }
        if (searching == true ){
            System.out.println("No Match Found");
        }
    }
}

