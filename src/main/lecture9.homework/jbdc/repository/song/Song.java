package jbdc.repository.song;

import jbdc.repository.artist.Artist;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Song {

    private int id;
    private String name;
    private int durationInSec;
    private LocalDate dateOfSongCreation;
    private int artistId;
}
