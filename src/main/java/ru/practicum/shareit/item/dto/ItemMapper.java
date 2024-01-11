package ru.practicum.shareit.item.dto;

import ru.practicum.shareit.item.model.Item;

/**
 * Класс ItemMapper позволяет преобразовать вещь Item в нужный формат возврата данных ItemDto.
 */
public class ItemMapper {
    public static ItemDto toItemDto(Item item) {
        return new ItemDto(item.getId(), item.getName(), item.getDescription(),
                item.getAvailable(),
        item.getOwner(),
        item.getRequest() != null ? item.getRequest().getId() : null
        );
    }
}
