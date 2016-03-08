package net.sunzc.bandwagonhost.http.model;

/**
 * Created by sun on 16-3-8.
 */
public class ServiceInfo {

    String hostname;// Hostname of the VPS
    String node_ip;// IP address of the physical node
    String node_alias;// Internal nickname of the physical node
    String node_location;// Physical location (country, state)
    String location_ipv6_ready;// Whether IPv6 is supported at the current location
    String plan;// Name of plan
    String plan_monthly_data;// Allowed monthly data transfer (bytes)
    String plan_disk;// Disk quota (bytes)
    String plan_ram;// RAM (bytes)
    String plan_swap;// SWAP (bytes)
    String os;// Operating system
    String email;// Primary e-mail address of the account
    String data_counter;// Data transfer used in the current billing month
    String data_next_reset;// Date and time of transfer counter reset (UNIX timestamp)
    String ip_addresses;// IPv4 and IPv6 addresses assigned to VPS (Array)
    String plan_max_ipv6s;// Maximum number of IPv6 addresses allowed by plan
    String rdns_api_available;// Whether or not rDNS records can be set via API
    String ptr;// rDNS records (Array of two-dimensional arrays;// ip=>value)
    String suspended;// Whether VPS is suspended

    @Override
    public String toString() {
        return "ServiceInfo{" +
                "hostname='" + hostname + '\'' +
                ", node_ip='" + node_ip + '\'' +
                ", node_alias='" + node_alias + '\'' +
                ", node_location='" + node_location + '\'' +
                ", location_ipv6_ready='" + location_ipv6_ready + '\'' +
                ", plan='" + plan + '\'' +
                ", plan_monthly_data='" + plan_monthly_data + '\'' +
                ", plan_disk='" + plan_disk + '\'' +
                ", plan_ram='" + plan_ram + '\'' +
                ", plan_swap='" + plan_swap + '\'' +
                ", os='" + os + '\'' +
                ", email='" + email + '\'' +
                ", data_counter='" + data_counter + '\'' +
                ", data_next_reset='" + data_next_reset + '\'' +
                ", ip_addresses='" + ip_addresses + '\'' +
                ", plan_max_ipv6s='" + plan_max_ipv6s + '\'' +
                ", rdns_api_available='" + rdns_api_available + '\'' +
                ", ptr='" + ptr + '\'' +
                ", suspended='" + suspended + '\'' +
                '}';
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getNode_ip() {
        return node_ip;
    }

    public void setNode_ip(String node_ip) {
        this.node_ip = node_ip;
    }

    public String getNode_alias() {
        return node_alias;
    }

    public void setNode_alias(String node_alias) {
        this.node_alias = node_alias;
    }

    public String getNode_location() {
        return node_location;
    }

    public void setNode_location(String node_location) {
        this.node_location = node_location;
    }

    public String getLocation_ipv6_ready() {
        return location_ipv6_ready;
    }

    public void setLocation_ipv6_ready(String location_ipv6_ready) {
        this.location_ipv6_ready = location_ipv6_ready;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getPlan_monthly_data() {
        return plan_monthly_data;
    }

    public void setPlan_monthly_data(String plan_monthly_data) {
        this.plan_monthly_data = plan_monthly_data;
    }

    public String getPlan_disk() {
        return plan_disk;
    }

    public void setPlan_disk(String plan_disk) {
        this.plan_disk = plan_disk;
    }

    public String getPlan_ram() {
        return plan_ram;
    }

    public void setPlan_ram(String plan_ram) {
        this.plan_ram = plan_ram;
    }

    public String getPlan_swap() {
        return plan_swap;
    }

    public void setPlan_swap(String plan_swap) {
        this.plan_swap = plan_swap;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getData_counter() {
        return data_counter;
    }

    public void setData_counter(String data_counter) {
        this.data_counter = data_counter;
    }

    public String getData_next_reset() {
        return data_next_reset;
    }

    public void setData_next_reset(String data_next_reset) {
        this.data_next_reset = data_next_reset;
    }

    public String getIp_addresses() {
        return ip_addresses;
    }

    public void setIp_addresses(String ip_addresses) {
        this.ip_addresses = ip_addresses;
    }

    public String getPlan_max_ipv6s() {
        return plan_max_ipv6s;
    }

    public void setPlan_max_ipv6s(String plan_max_ipv6s) {
        this.plan_max_ipv6s = plan_max_ipv6s;
    }

    public String getRdns_api_available() {
        return rdns_api_available;
    }

    public void setRdns_api_available(String rdns_api_available) {
        this.rdns_api_available = rdns_api_available;
    }

    public String getPtr() {
        return ptr;
    }

    public void setPtr(String ptr) {
        this.ptr = ptr;
    }

    public String getSuspended() {
        return suspended;
    }

    public void setSuspended(String suspended) {
        this.suspended = suspended;
    }
}
