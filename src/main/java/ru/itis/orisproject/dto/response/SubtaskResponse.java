package ru.itis.orisproject.dto.response;

import java.util.UUID;

public record SubtaskResponse(UUID subtaskId, String name, String description, boolean completed) {
}
