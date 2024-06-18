package BMS.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AuditColumn {
    int id;
    Date createdAt;
    Date currModifiedAt;
}
