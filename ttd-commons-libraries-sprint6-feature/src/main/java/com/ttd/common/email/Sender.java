package com.ttd.common.email;

import org.springframework.mail.SimpleMailMessage;

/**
 * Sends an e-mail message.
 *
 */
public interface Sender {

    /**
     * Sends e-mail using Velocity template for the body and
     * the properties passed in as Velocity variables.
     *
     * @param   msg                 The e-mail message to be sent, except for the body.
     * @param   hTemplateVariables  Variables to use when processing the template.
     */
	public String send(final SimpleMailMessage msg, final String emailBody, final String recieptName);
    
    //public void sendEmailtoPiligrim(TransactionDetail tranDetails);

}

