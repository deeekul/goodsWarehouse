package ru.vsu.cs.kulinchenko.goodsWarehouse.models;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotEmpty(message = "Title should not be empty!")
    @Column(name = "title")
    private String title;

    @NotEmpty(message = "Product type should not be empty!")
    @ManyToOne
    @JoinColumn(name = "type_id")
    private ProductType type;

    @NotEmpty(message = "Provider should not be empty!")
    @ManyToOne
    @JoinColumn(name = "provider_id")
    private Provider provider;

    @NotEmpty(message = "Unit price should not be empty!")
    @Min(value = 0, message = "Unit price should be greater than 0!")
    @Column(name = "unit_price")
    private int unitPrice;

    @NotEmpty(message = "Description should not be empty!")
    @Column(name = "description", columnDefinition = "text")
    private String description;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "product")
    private List<Image> images = new ArrayList<>();

    @Column(name = "preview_image_id")
    private Long previewImageId;

    @OneToMany(mappedBy = "product")
    private Set<ProductsList> productsLists = new HashSet<>();

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public ProductType getType() {
        return type;
    }

    public Provider getProvider() {
        return provider;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public String getDescription() {
        return description;
    }

    public List<Image> getImages() {
        return images;
    }

    public Long getPreviewImageId() {
        return previewImageId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public void setPreviewImageId(Long previewImageId) {
        this.previewImageId = previewImageId;
    }

    public Set<ProductsList> getProductsLists() {
        return productsLists;
    }

    public void setProductsLists(Set<ProductsList> productsLists) {
        this.productsLists = productsLists;
    }

    public void addImageToProduct(Image image) {
        image.setProduct(this);
        images.add(image);
    }
}
