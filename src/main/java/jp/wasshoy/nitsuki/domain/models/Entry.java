package jp.wasshoy.nitsuki.domain.models;

import java.util.Date;

public record Entry(
    Integer id, String title, String content, Date createdAt, Date updatedAt, Boolean published) {}
