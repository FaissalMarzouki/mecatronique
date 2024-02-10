package com.Mecatronique.Faissal.entity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mecatronique.Faissal.entity.Image;
import com.Mecatronique.Faissal.repository.ImageRepository;

@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;

    public void saveImage(Image image) {
        imageRepository.save(image);
    }

    public Image getImageById(String id) {
        return imageRepository.findById(id).orElse(null);
    }
}

