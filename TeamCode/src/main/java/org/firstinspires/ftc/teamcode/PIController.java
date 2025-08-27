package org.firstinspires.ftc.teamcode;

public class PIController
{

    public double m_Kp;
    public double m_Ki;
    public double m_LimitMin = -1;
    public double m_LimitMax =  1;
    public double m_Result;
    public double m_Error = 0;
    public double m_Iterm = 0;

    public PIController(double Kp, double Ki)
    {
        m_Kp = Kp;
        m_Ki = Ki;
    }

    public double GetPI()
    {
        m_Iterm = m_Iterm + (m_Error * m_Ki);

        if      (m_Iterm < m_LimitMin) m_Iterm = m_LimitMin;
        else if (m_Iterm > m_LimitMax) m_Iterm = m_LimitMax;

        m_Result = (m_Error * m_Kp) + m_Iterm;

        if      (m_Result < m_LimitMin) m_Result = m_LimitMin;
        else if (m_Result > m_LimitMax) m_Result = m_LimitMax;

        return m_Result;
    }

}
