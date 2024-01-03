package frc.robot.subsystems.intake;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.MotorControlGroup;
import frc.robot.Constants.*; 

public class IntakeSubsystem extends SubsystemBase{

  private CANSparkMax m_intakeMotor;
  private MotorControlGroup m_intakeMotorGroup;

  public IntakeSubsystem() {
    m_intakeMotor = new CANSparkMax(IntakeConstants.kIntakeMotor, CANSparkMax.MotorType.kBrushless);
    m_intakeMotorGroup = new MotorControlGroup(m_intakeMotor);

    //Sets the default brake mode of the motor group to be brake (set parameter to false for coast)
    m_intakeMotorGroup.setDefaultBrakeMode(true); 

    

    //If we need to set a particular motor to inverted, we can do so here
    //e.g.
    /* 
     * m_intakeMotorGroup.setInverted(n); {where n is the index of the motor in the group (counts from 0)}
     */
  }

  public void setPower(double power) {
    m_intakeMotorGroup.setPower(power);
  }

  public void setMotorGroupInverted(boolean inverted) {
    m_intakeMotorGroup.setInverted();
  }

  public void setTargetedMotorInverted(int motorIndex) {
    m_intakeMotorGroup.setInverted(motorIndex);
  }

  public double getPower() {
    return m_intakeMotorGroup.getPower();
  }

  public double getPosition() {
    return m_intakeMotorGroup.getPosition();
  }

  public void setDefaultBrakeMode(boolean brakeMode) {
    m_intakeMotorGroup.setDefaultBrakeMode(brakeMode);
  }
}
