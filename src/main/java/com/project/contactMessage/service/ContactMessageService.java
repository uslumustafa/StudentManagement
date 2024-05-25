package com.project.contactMessage.service;

import com.project.contactMessage.repository.ContactMessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor //clasın ıcındekı fınal ıle setledıgınızden fınal olusturur
public class ContactMessageService {

    private final ContactMessageRepository contactMessageRepository;

}
