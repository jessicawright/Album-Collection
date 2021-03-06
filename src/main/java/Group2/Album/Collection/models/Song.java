package Group2.Album.Collection.models;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Song {
	
	@Id
	@GeneratedValue
	private Long id;
	private String songTitle;
	private String duration;
	private int rating;
	
	@ManyToOne
	@JsonIgnore
	private Album album;

	@ManyToMany
	private Collection<Tag> tags;

	@OneToMany(mappedBy="song")
	private Collection<SongComment> songComments;

	public Song() {}

	public Song(String songTitle, String duration, int rating, Album album, Tag ...tags) {
		this.songTitle = songTitle;
		this.duration = duration;
		this.rating = rating;
		this.album = album;
		this.tags = Arrays.asList(tags);
	}
	
	public Long getId() {
		return id;
	}

	public String getSongTitle() {
		return songTitle;
	}


	public String getDuration() {
		return duration;
	}

	public int getRating() {
		return rating;
	}

	public Album getAlbum() {
		return album;
	}

	public Collection<Tag> getTags() {
		return tags;
	}

	public Collection<SongComment> getsongComments() {
		return songComments;
	}

	// adding a comment to Album
	public void addComment(Comment comment) {
		songComments.add((SongComment) comment);
	}
	// adding a tag to Song
	public void addTag(Tag tag) {
		tags.add(tag);
	}
	
	@Override
	public String toString() {
		return "Song [id=" + id + ", songTitle=" + songTitle + ", duration=" + duration + ", rating=" + rating
				+ ", album=" + album + ", tags=" + tags + ", songComments=" + songComments + "]";
	}

	

}
