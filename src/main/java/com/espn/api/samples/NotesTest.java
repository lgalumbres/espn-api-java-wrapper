package com.espn.api.samples;

import java.util.List;

import com.espn.api.sports.research.Note;
import com.espn.api.sports.research.Notes;
import com.espn.api.sports.research.NotesAPI;


public class NotesTest {

   public static void main(String[] args) {
      NotesAPI notesAPI = new NotesAPI(NotesAPI.RESOURCE_BASEBALL_MLB);
      Notes root = notesAPI.getAPIData();
      
      System.out.println("timeStamp=" + root.getTimestamp());
      System.out.println("status=" + root.getStatus());
      System.out.println("resultsLimit=" + root.getResultsLimit());
      System.out.println("resultsCount=" + root.getResultsCount());
      System.out.println("resultsOffset=" + root.getResultsOffset());
      
      List<Note> notes = root.getNotes();
      if (notes != null && notes.size() > 0) {
         for (Note note : notes) {
            System.out.println(note.getHeadline());
            System.out.println(note.getText());
            System.out.println();
         }
      }
   }

}
