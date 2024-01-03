package frc.robot.commands.intake;
import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.*;
import frc.robot.subsystems.intake.IntakeSubsystem;

public class intakeCommand extends CommandBase {
    private final IntakeSubsystem m_intakeSubsystem;
    private XboxController controller;
    
    public intakeCommand(IntakeSubsystem intakeSubsystem, XboxController controller) {
        m_intakeSubsystem = intakeSubsystem;
        this.controller = controller;
        addRequirements(intakeSubsystem);
    }
    
    @Override
    public void initialize() 
    {
        
    }
    
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        m_intakeSubsystem.setPower(0);
        if (controller.getLeftTriggerAxis() > 0) {
            m_intakeSubsystem.setPower(1);
        } else if (controller.getRightTriggerAxis() > 0) {
            m_intakeSubsystem.setPower(-1);
        }
    }
}

  