package CaseStudy.ParkingLot.src.models;

public abstract class BaseModel {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}

// NOTE: We can also have createdBy, createdAt, updatedBy, updatedAt
