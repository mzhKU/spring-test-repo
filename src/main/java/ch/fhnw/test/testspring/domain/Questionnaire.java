package ch.fhnw.test.testspring.domain;

import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "questionnaires")
public class Questionnaire {
	@Id
	private String id;

	@Size(min=5, max=30)
	@NotNull
	private String title;

	@Size(min=10, max=50)
	private String description;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null) {
			return false;
		}
		if (getClass() != o.getClass()) {
			return false;
		}
		Questionnaire q = (Questionnaire) o;
		return Objects.equals(title, q.title) && Objects.equals(description, q.description);
	}

	@Override
	public int hashCode() {
        int hash = 7;
        hash = 31 * hash + id.hashCode();
        hash = 31 * hash + (title == null ? 0 : title.hashCode());
        hash = 31 * hash + (description == null ? 0 : description.hashCode());
        return hash;
	}
}
