package pl.sages.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sages.model.helpers.Status;
import pl.sages.model.helpers.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Application extends AbstractEntity {

  @OneToOne
  private JobOffer jobOffer;
  @OneToOne
  private Applicant applicant;

  private Date date;
  private Status status;
  private Date statusDate;
}
