package java2gui;
import java.util.ArrayList;
/**
 * @author Portia Ocran
 */
public class SongList
{
   private ArrayList<Song> recordList;
   private ArrayList<String> nameList;

   public SongList ()
   {
      ArrayList<Song> recordList1 = new ArrayList<Song>();
      ArrayList<String> nameList = new ArrayList<String>();
      this.nameList = nameList;
      this.recordList = recordList1;
   }

   public void add (Song song)
   {

      this.nameList.add(song.getSongTitle() + " - " + song.getSongArtist());
      this.recordList.add(song);

   }

   public ArrayList<Song> getRecordList ()
   {
      return recordList;
   }

   public void setRecordList (ArrayList<Song> recordList)
   {
      this.recordList = recordList;
   }

   public ArrayList<String> getNameList ()
   {
      return nameList;
   }

   public void setNameList (ArrayList<String> nameList)
   {
      this.nameList = nameList;
   }


}
