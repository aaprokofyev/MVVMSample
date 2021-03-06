package com.harman.domain.interactor

import com.harman.domain.model.Contact
import com.harman.domain.repository.ContactsRepository

class SaveContact constructor(private val contactsRepository: ContactsRepository) :
    UseCase<Contact, Long>() {
    override suspend fun performAction(param: Contact) = contactsRepository.saveContact(param)
}