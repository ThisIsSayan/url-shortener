package com.example.urlshortener.repository;

import com.example.urlshortener.model.Url;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlRepository extends JpaRepository<Url,Long>
{
    public Url findByShortLink(String shortLink);
}