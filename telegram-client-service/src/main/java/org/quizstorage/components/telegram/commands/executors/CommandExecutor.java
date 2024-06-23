package org.quizstorage.components.telegram.commands.executors;

import org.quizstorage.components.telegram.Command;
import org.telegram.telegrambots.meta.api.objects.Message;

public interface CommandExecutor {

    void execute(Message message);

    Command supportedCommand();

}