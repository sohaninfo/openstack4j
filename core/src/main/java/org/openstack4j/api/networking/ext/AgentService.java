package org.openstack4j.api.networking.ext;

import java.util.List;

import org.openstack4j.common.RestService;
import org.openstack4j.model.network.Agent;

/**
 * Networking (Neutron) Agent Extension API
 *
 * @author Yin Zhang
 */
public interface AgentService extends RestService {

    /**
     * List neutron agents.
     *
     * @return a list of available neutron agents
     */
    List<? extends Agent> list();

    /**
     * Returns the agent with agentId.
     *
     * @param agentId id of agent
     * @return agent
     */
    Agent getAgent(String agentId);

    /**
     * Sets the admin_state_up.
     *
     * @param agentId the id of the agent to set state for
     * @param state the state to set
     * @return a new reference to the updated agent
     */
    Agent setAdminStateUp(String agentId, boolean state);

}
